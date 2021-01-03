package _03_jars._2_jukebox;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.player.advanced.AdvancedPlayer;

/*   If you don't have javazoom.jar in your project, you can download it from here: http://bit.ly/javazoom
 *   Right click your project and add it as a JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {
	Icon image = new ImageIcon("https://i.ytimg.com/vi/BHACKCNDMW8/maxresdefault.jpg");
	Icon image2 = new ImageIcon("https://images-na.ssl-images-amazon.com/images/I/61MGAGEdVnL._AC_SX425_.jpg");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton start = new JButton();
	JButton stop = new JButton();
	JButton dd = new JButton(image);
	JButton mp3 = new JButton(image2);
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	static int stopbroadcaster = 0;
	Song why = new Song("/headless/Downloads/647890_Dance-Mr-Funnybones-LOOP.mp3");
	Song why2 = new Song("mp3.mp3");
	Song why3 = new Song("/headless/Downloads/647890_Dance-Mr-Funnybones-LOOP.mp3");
    public void run() {

		// 1. Find an mp3 on your computer or on the Internet.
		// 2. Create a Song object for that mp3

		// 3. Play the Song

		/*
		 * 4. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */

    	frame.setVisible(true);
start.addActionListener(this);
stop.addActionListener(this);
dd.addActionListener(this);
mp3.addActionListener(this);
start.setText("Start Song");
stop.setText("Stop Song");
dd.add(label1);
mp3.add(label2);
dd.setPreferredSize(new Dimension( 498,483));
mp3.setPreferredSize(new Dimension (425,197));
panel.add(dd);
panel.add(mp3);
panel.add(start);
panel.add(stop);
//label1.add(image);
//impossible but done
frame.add(panel);
frame.pack();
for (int i = 0; i < 1; i++) {
	why.play();
	if(stopbroadcaster==0) {
		i=0;
	}
	else if (stopbroadcaster==1) {
		why.stop();
	}}
    }
    
    
	/* Use this method to add album covers to your Panel. */
	//private JLabel loadImage(Icon image) {
	//	URL imageURL = getClass().getResource(image);
	//	Icon icon = new ImageIcon(imageURL);
	//	return new JLabel(icon);
//	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(stop)) {
			stopbroadcaster=1;
		}
		                               
		if(e.getSource().equals(start)) {
			stopbroadcaster=0;
			System.out.println("Start");
			}
		if(e.getSource().equals(dd)) {
			why=why3;
		}
		if(e.getSource().equals(mp3)) {
			why=why2;
		}
	}
	}



class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}


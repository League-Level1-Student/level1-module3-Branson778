package _03_jars._3_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {
JLabel textureflash = new JLabel();
JFrame frame = new JFrame("The Magic Box contains many secrets...");
JPanel panel = new JPanel();
int lint =	-595775;
int tint = -69429;
int quadrant = -13815243;
	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 *done
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * done
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 *     done!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 *   
	 *     
	 */

	BufferedImage backgroundImage;


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
	
		frame.add(this);
		setPreferredSize(new Dimension(1000, 1000));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.add(panel);
		
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_03_jars/_3_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		MediaPalace j = new MediaPalace();
	if(backgroundImage.getRGB(e.getX(), e.getY())==lint) {
		textureflash =	j.loadImageFromWithinProject("placeholder.png");
		panel.add(textureflash);
		frame.pack();
	}
	if(backgroundImage.getRGB(e.getX(), e.getY())==tint) {
		textureflash = j.loadImageFromWithinProject("wet.jpg");
		panel.add(textureflash);
		frame.pack();
	}
	if(backgroundImage.getRGB(e.getX(), e.getY())==quadrant) {
		textureflash = j.loadImageFromWithinProject("nightmares2.png");
		panel.add(textureflash);
		frame.pack();
	}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	//	panel.remove(textureflash);
	//	frame.pack();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}



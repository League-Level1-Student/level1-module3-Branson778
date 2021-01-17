package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {
public static void main(String[] args) {
	Random one = new Random();
	int ranX=one.nextInt(11);
	Random two = new Random();
	int ranY=two.nextInt(11);
	World test = new World();
	test.show();
	Location veins = new Location(1, 1);
	Location eyes = new Location(ranX, ranY);
	Location whhy = new Location(ranX+1, ranY);
	Location uggh = new Location(ranX-1,ranY);
	Bug yeet = new Bug(Color.BLUE);
	Bug buggy = new Bug();
	Flower ugh = new Flower();
	Flower why = new Flower();
	test.add(veins, yeet);
	test.add(eyes, buggy);
	test.add(whhy,ugh);
	test.add(uggh, why);
	for (int i = 0; i < 10; i++) {
		
		for (int j = 0; j < 10; j++) {
			Location nnn = new Location(i,j);
			Flower mmm = new Flower();
			test.add(nnn, mmm);
		}
	}
	buggy.turn();
}
}

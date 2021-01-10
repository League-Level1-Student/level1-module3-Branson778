package _06_gridworld;

import java.util.Random;

import info.gridworld.actor.Bug;
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
	Bug yeet = new Bug();
	Bug buggy = new Bug();
	test.add(veins, yeet);
	test.add(eyes, buggy);
}
}

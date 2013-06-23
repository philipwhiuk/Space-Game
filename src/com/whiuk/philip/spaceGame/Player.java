package com.whiuk.philip.spaceGame;

import java.util.Random;

/**
 * 
 * @author Philip Whitehouse
 *
 */
public class Player {

	public static void init() {
		// TODO Auto-generated method stub
		
	}

	public static void initFromScenario(Scenario s) {
		init();
	}

	public static void moveToRandomSystem(int[] systems) {
		int i = Game.random.nextInt(systems.length);
		moveToSystem(systems[i]);
	}

	private static void moveToSystem(int i) {
		// TODO Auto-generated method stub
		
	}

}

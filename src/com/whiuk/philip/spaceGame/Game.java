package com.whiuk.philip.spaceGame;

import java.util.Random;

/**
 * 
 * @author Philip Whitehouse
 *
 */
public class Game {
	public static Random random;
	int[] startSystems = {};

	void begin(Scenario s) {
		ReputationManager.initFromScenario(s);
		GameObjectManager.initFromScenario(s);
		MissionManager.initFromScenario(s);
		Player.initFromScenario(s);
		//
		Player.moveToRandomSystem(startSystems);
	}
}

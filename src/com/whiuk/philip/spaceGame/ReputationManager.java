package com.whiuk.philip.spaceGame;

/**
 * 
 * @author Philip Whitehouse
 *
 */
public class ReputationManager {
	static int[] faction_reputation;
	static String[] faction_names;
	static int[] faction_hostility;
	static int[] faction_reputation_change_type;

	static void initFromScenario(Scenario s) {
		faction_names = s.getFactionNames();
		faction_reputation = s.getFactionReputation();
		faction_hostility = s.getFactionHostility();
		faction_reputation_change_type = s.getFactionReputationChangeType();
	}
	
	
	static int getHostility(int faction) {
		return faction_hostility[faction];
	}	
	/*
	 * Action handlers
	 */
	static void onHit(int faction) {
		//TODO: onHit
	}
	static void onDestroy(int faction) {
		//TODO: onDestroy
	}	
	static void onCapture(int faction) {
		//TODO: onCapture		
	}
}

package com.whiuk.philip.spaceGame;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;



/**
 * 
 * @author Philip Whitehouse
 *
 */
public class MissionManager {
	
	public static HashMap<Integer,Mission> activeMissions;
	public static ArrayList<MissionLogEntry> missionLog;
	public static File missionData;

	public static void init() {		
		activeMissions = new HashMap<Integer,Mission>();
		missionLog = new  ArrayList<MissionLogEntry>();
	}

	static void initFromScenario(Scenario s) {
		init();
		activeMissions = s.getActiveMissions();
		missionLog = s.getMissionLog();
		missionData = s.getMissionData();
	}
	
	public static int getActiveMissionCount() {
		return activeMissions.size();
	}
	/*
	 * Action handlers
	 */
	public static void onDestroy(int ID) {
		//TODO: onDestroy
	}
	public static void onCapture(int ID) {
		//TODO: onDestroy
	}	
}

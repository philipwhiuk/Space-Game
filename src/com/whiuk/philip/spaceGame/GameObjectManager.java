package com.whiuk.philip.spaceGame;


/**
 * 
 * @author Philip Whitehouse
 *
 */
public class GameObjectManager {
	public static final int UNKNOWN = 0;
	public static final int NEUTRAL = 1;
	public static final int FRIENDLY = 2;
	public static final int HOSTILE = 3;
	public static final int DISABLED = 4;
	public static final int CAPTURED = 5;
	public static final int DESTROYED = 6;
	
	private static String[] object_names;
	private static int[] object_status;
	private static int[] object_position;	
	
	public static void destroy(int ID) {
		object_status[ID] = DESTROYED;		
	}	
	public static void capture(int ID) {
		object_status[ID] = CAPTURED;
	}
	public static void initFromScenario(Scenario s) {
		object_names = s.getObjectNames();
		object_status = s.getObjectStatus();
		object_position = s.getObjectPosition();
	}
	
}

package com.whiuk.philip.spaceGame;


/**
 * 
 * @author Philip Whitehouse
 *
 */
public class Mission {
    /**
     * 
     * @author Philip
     *
     */
	public enum Status {

    }

    final int ID;
	
	//Mission
	final int probability;
	
	//Mission Requirements
	final int[] missionRequirements;
	final int[] notMissions;	
	final int[] itemRequirements;

	//Mission Spec
	final boolean hasPickup;
	final boolean hasCargo;
	final boolean hasDropoff;
	
	//Mission Parameters
	final int[] startPoint;
	final String startText;
	
	final int[] pickupPoint;
	final String pickupText;
	
	final int[] dropOffPoint;
	final String dropOffText;
	
	final int[] completionPoint;
	final String completionText;

	final int cargo_type;
	final int cargo_weight;
	
	/**
	 * One of these is chosen as a target to board, capture, disable, destroy, etc.
	 */
	final int target[];
	/**
	 * The purpose of the target.
	 * 0: No target
	 * 1: Destroy
	 * 2: Disable (Dominate for planets)
	 * 3: Dock (Land for planets)
	 * 4: Board & Cargo Pickup
	 * 5: 
	 */
	private final int target_purpose;		//The purpose of the target

	/**
	 * Text displayed when the action is completed
	 */
	private final String target_text;
	
	/**
	 * Text to display when the mission is failed. (Otherwise system message shown)
	 */
	private final String fail_text;
	
	/**
	 * Constructor
	 * @param id	Unique mission ID
	 * @param bits  Various booleans
	 * @param data  Various integer data
	 * @param text  Various string data
	 */
	public Mission(int id, boolean[] bits, int[][] data, String[] text) {
		this.ID = id;
		this.startPoint = data[0];
		this.startText = text[0];
		this.pickupPoint = data[1];
		this.pickupText = text[1];
		this.dropOffPoint = data[2];
		this.dropOffText = text[2];
		this.completionPoint = data[3];
		this.completionText = text[3];

		this.target = data[4];
		this.target_text = text[4];
		
		this.fail_text = text[5];
		
		this.missionRequirements = data[5];
		this.notMissions = data[6];
		this.itemRequirements = data[7];		
		
		this.target_purpose = data[8][0];
		this.cargo_type = data[8][1];
		this.cargo_weight = data[8][2];
		this.probability = data[8][3];

		this.hasPickup = bits[0];
		this.hasDropoff = bits[1];
		this.hasCargo = bits[2];
	}
}

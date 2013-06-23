package com.whiuk.philip.spaceGame;


/**
 * 
 * @author Philip Whitehouse
 *
 */
public abstract class GameObject {
	/**
	 * The unique ID of the game object
	 */
	private int ID;
	/**
	 * The ID of the faction owner
	 */
	private int owner;
	/**
	 * Default constructor
	 * @param id The unique ID
	 */
	public GameObject(int id, int owner) {
		this.ID = id;
		this.owner = owner;
	}
	
	public void destroy() {
		GameObjectManager.destroy(ID);
		MissionManager.onDestroy(ID);
		ReputationManager.onDestroy(owner);
	}	
	public void capture() {
		GameObjectManager.capture(ID);
		MissionManager.onCapture(ID);
		ReputationManager.onCapture(owner);
	}
}

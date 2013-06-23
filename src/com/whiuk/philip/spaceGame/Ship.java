package com.whiuk.philip.spaceGame;

/**
 * 
 * @author Philip Whitehouse
 *
 */
public class Ship extends GameObject {
	String name;
	ShipType type;
	int faction;
	int[] cargo;
	int hostility;

	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param type
	 * @param faction
	 * @param cargo
	 */
	public Ship(int id, String name, ShipType type, int faction, int[] cargo) {
		super(id,faction);
		this.name = name;
		this.type = type;
		this.cargo = cargo;
		hostility = ReputationManager.getHostility(faction);
	}
	
	private void onHit(int weaponDamage) {
		//TODO: Weapon, Armour damage
		//TODO: Adjust Hostility
		ReputationManager.onHit(faction);
	}
}

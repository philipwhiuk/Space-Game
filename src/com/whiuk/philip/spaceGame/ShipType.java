package com.whiuk.philip.spaceGame;

import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Philip Whitehouse
 *
 */
public class ShipType {
	private int ID;
	private String name;
	private Organisation builder;
	private int price;
	private List<Requirement> requirements;
	private List<Location> availableLocations;
	
	private HashMap<Outfit,Integer>[] outfits;

	
}

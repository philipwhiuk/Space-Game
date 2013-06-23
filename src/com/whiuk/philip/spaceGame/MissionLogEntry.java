package com.whiuk.philip.spaceGame;


/**
 * 
 * @author Philip Whitehouse
 *
 */
public class MissionLogEntry {
	private int gameDate;
	private String mission;
	private String updateMessage;
	private String location;
	
	public MissionLogEntry(int gameDate, String mission, String updateMessage, String location) {
		this.gameDate = gameDate;
		this.mission = mission;
		this.updateMessage = updateMessage;
		this.location = location;
	}
	
	public String getText() {
		return ""+gameDate/10+"."+(gameDate%10)+" :: "+mission+" - "+updateMessage+" - "+location;
	}
}

package com.whiuk.philip.spaceGame;

import static org.junit.Assert.*;

import org.junit.Test;


public class MissionLogEntryTest {

	@Test
	public void testGetText() {
		MissionLogEntry test = new MissionLogEntry(38456,"Some Mission","Dropped off cargo","Omega Persius IV");
		assertEquals("3845.6 :: Some Mission - Dropped off cargo - Omega Persius IV",test.getText());
	}

}

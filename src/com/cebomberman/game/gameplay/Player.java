package com.cebomberman.game.gameplay;

import com.cebomberman.game.graphics.PlayerGraphics;

/**
 * 
 * @author
 * 
 */
public class Player {
	public PlayerLogic playerLogic;
	public PlayerGraphics playerGraphics;

	/**
	 * 
	 */
	public Player() {
		playerLogic = new PlayerLogic();
		playerGraphics = new PlayerGraphics();
		// playerGraphics.setSpeed(playerLogic.getSpeed()) ;
	}

	/**
	 * 
	 */
	public void setBombCoordinate() {
		// playerLogic.bombX = playerGraphics.getCurrentPositionX();
		// playerLogic.bombY = playerGraphics.getCurrentPositionY();
	}

	private void removePoint() {

	}

	private void invertKeys() {

	}
}

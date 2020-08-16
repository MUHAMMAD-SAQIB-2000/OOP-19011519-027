package com.yourFriendsChoice.CreateGame;

public class CreateGame {
	public static String csvFile = "CreateGame.csv";
	private String PLAYER_NAME;
	private int PLAYER_ID;
	private int PLAYER_SCORE;
	
	public String getPLAYER_NAME() {
		return PLAYER_NAME;
	}
	public void setPLAYER_NAME(String pLAYER_NAME) {
		PLAYER_NAME = pLAYER_NAME;
	}
	public int getPLAYER_ID() {
		return PLAYER_ID;
	}
	public void setPLAYER_ID(int pLAYER_ID) {
		PLAYER_ID = pLAYER_ID;
	}
	public int getPLAYER_SCORE() {
		return PLAYER_SCORE;
	}
	public void setPLAYER_SCORE(int pLAYER_SCORE) {
		PLAYER_SCORE = pLAYER_SCORE;
	}
	
	
	public String toString() {
		String str = null;
		System.out.println("Player ID is: " + this.PLAYER_ID + 
							" " + "Player Name is: " + this.PLAYER_ID +
							" " + "Player Score is: "+ this.PLAYER_SCORE);
		return str;
	}

}

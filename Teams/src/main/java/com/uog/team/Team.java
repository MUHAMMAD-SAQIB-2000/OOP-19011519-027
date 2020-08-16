package com.uog.team;

public class Team {
	private int TEAM_ID;
	private TeamType TEAMTYPE_ID;
	private String TEAM_NAME;
	private String TEAM_DESC;
	private String TEAM_CODE;
	private String TEAM_IMAGE= "C:\\Users\\DXB\\Desktop\\Team.png";
	public int getTEAM_ID() {
		return TEAM_ID;
	}
	public void setTEAM_ID(int tEAM_ID) {
		TEAM_ID = tEAM_ID;
	}
	public TeamType getTEAMTYPE_ID() {
		return TEAMTYPE_ID;
	}
	public void setTEAMTYPE_ID(TeamType tEAMTYPE_ID) {
		TEAMTYPE_ID = tEAMTYPE_ID;
	}
	public String getTEAM_NAME() {
		return TEAM_NAME;
	}
	public void setTEAM_NAME(String tEAM_NAME) {
		TEAM_NAME = tEAM_NAME;
	}
	public String getTEAM_DESC() {
		return TEAM_DESC;
	}
	public void setTEAM_DESC(String tEAM_DESC) {
		TEAM_DESC = tEAM_DESC;
	}
	public String getTEAM_CODE() {
		return TEAM_CODE;
	}
	public void setTEAM_CODE(String tEAM_CODE) {
		TEAM_CODE = tEAM_CODE;
	}
	public String getTEAM_IMAGE() {
		return TEAM_IMAGE;
	}
	

	
}

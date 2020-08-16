package com.uog.team;







public class TeamType {
	private int TEAMTYPE_ID;
	private String TEAMTYPE_NAME;
	private String TEAMTYPE_DESC;
	private String TEAMTYPE_LINK;
	private String TEAMTYPE_ICON = "C:\\Users\\DXB\\Desktop\\Team.png";
	
	public String getTEAMTYPE_ICON() {
		return TEAMTYPE_ICON;
	}
	public int getTEAMTYPE_ID() {
		return TEAMTYPE_ID;
	}
	public void setTEAMTYPE_ID(int tEAMTYPE_ID) {
		TEAMTYPE_ID = tEAMTYPE_ID;
	}
	public String getTEAMTYPE_NAME() {
		return TEAMTYPE_NAME;
	}
	public void setTEAMTYPE_NAME(String tEAMTYPE_NAME) {
		TEAMTYPE_NAME = tEAMTYPE_NAME;
	}
	public String getTEAMTYPE_DESC() {
		return TEAMTYPE_DESC;
	}
	public void setTEAMTYPE_DESC(String tEAMTYPE_DESC) {
		TEAMTYPE_DESC = tEAMTYPE_DESC;
	}
	public String getTEAMTYPE_LINK() {
		return TEAMTYPE_LINK;
	}
	public void setTEAMTYPE_LINK(String tEAMTYPE_LINK) {
		TEAMTYPE_LINK = tEAMTYPE_LINK;
	}
	

	
}

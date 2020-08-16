package com.uog.channel;

import com.uog.privacy.Privacy;







public class Channel {

	private int CHANNEL_ID;
	private Privacy PRIVACY_ID;
	private String CHANNEL_NAME;
	private String CHANNEL_DESC;
	private boolean ISPUBLIC;
	private String CHANNEL_EMAIL;
	
	public int getCHANNEL_ID() {
		return CHANNEL_ID;
	}
	public void setCHANNEL_ID(int cHANNEL_ID) {
		CHANNEL_ID = cHANNEL_ID;
	}
	public Privacy getPRIVACY_ID() {
		return PRIVACY_ID;
	}
	public void setPRIVACY_ID(Privacy pRIVACY_ID) {
		PRIVACY_ID = pRIVACY_ID;
	}
	public String getCHANNEL_NAME() {
		return CHANNEL_NAME;
	}
	public void setCHANNEL_NAME(String cHANNEL_NAME) {
		CHANNEL_NAME = cHANNEL_NAME;
	}
	public String getCHANNEL_DESC() {
		return CHANNEL_DESC;
	}
	public void setCHANNEL_DESC(String cHANNEL_DESC) {
		CHANNEL_DESC = cHANNEL_DESC;
	}
	public boolean isISPUBLIC() {
		return ISPUBLIC;
	}
	public void setISPUBLIC(boolean iSPUBLIC) {
		ISPUBLIC = iSPUBLIC;
	}
	public String getCHANNEL_EMAIL() {
		return CHANNEL_EMAIL;
	}
	public void setCHANNEL_EMAIL(String cHANNEL_EMAIL) {
		CHANNEL_EMAIL = cHANNEL_EMAIL;
	}
	
}

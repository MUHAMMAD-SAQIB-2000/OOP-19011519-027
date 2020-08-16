package com.uog.team;

import com.uog.role.Role;
import com.uog.user.User;

public class Team_Member {
	private Team TEAM_ID;
	private User USER_ID;
	private Role TEAMMEMBERROLE_ID;
	private boolean TEAMMEMBERROLE_REQUEST;
	
	public Team getTEAM_ID() {
		return TEAM_ID;
	}
	public void setTEAM_ID(Team tEAM_ID) {
		TEAM_ID = tEAM_ID;
	}
	public User getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(User uSER_ID) {
		USER_ID = uSER_ID;
	}
	public Role getTEAMMEMBERROLE_ID() {
		return TEAMMEMBERROLE_ID;
	}
	public void setTEAMMEMBERROLE_ID(Role tEAMMEMBERROLE_ID) {
		TEAMMEMBERROLE_ID = tEAMMEMBERROLE_ID;
	}
	public boolean isTEAMMEMBERROLE_REQUEST() {
		return TEAMMEMBERROLE_REQUEST;
	}
	public void setTEAMMEMBERROLE_REQUEST(boolean tEAMMEMBERROLE_REQUEST) {
		TEAMMEMBERROLE_REQUEST = tEAMMEMBERROLE_REQUEST;
	}

}

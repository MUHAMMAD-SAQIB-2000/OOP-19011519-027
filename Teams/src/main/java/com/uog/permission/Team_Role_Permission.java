package com.uog.permission;

import com.uog.role.Role;
import com.uog.team.Team;

public class Team_Role_Permission {
	private Team TEAM_ID;
	private Role ROLE_ID;
	private Permission PERMISSION_ID;
	
	public Team getTEAM_ID() {
		return TEAM_ID;
	}
	public void setTEAM_ID(Team tEAM_ID) {
		TEAM_ID = tEAM_ID;
	}
	public Role getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(Role rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public Permission getPERMISSION_ID() {
		return PERMISSION_ID;
	}
	public void setPERMISSION_ID(Permission pERMISSION_ID) {
		PERMISSION_ID = pERMISSION_ID;
	}
	

}

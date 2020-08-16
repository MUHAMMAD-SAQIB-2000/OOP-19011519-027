package zainab;

public class Mob_Atr 
{
	private int mobid;
	private String mobmodel;
	private String color;
	public int getMobid() {
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public String getMobmodel() {
		return mobmodel;
	}
	public void setMobmodel(String mobmodel) {
		this.mobmodel = mobmodel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String Color) {
		if(Color=="red"||Color=="green")
			this.color = Color;
		else
			this.color = "red";
	}

}

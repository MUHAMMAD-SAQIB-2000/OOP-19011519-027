package _RecordManagementSystemJava;

public class Vehicle 
{
	private String Vtype;
	private String Vnumber;
	private String Vprice;
	private String Vmiles;
	private String VDOP; // VDOP vehicle date of purchase
	private String VDOS; // VDOS vehicle date of sale
	private String vReleaseYear;
	

	public String getvReleaseYear() {
		return vReleaseYear;
	}
	public void setvReleaseYear(String vReleaseYear) {
		this.vReleaseYear = vReleaseYear;
	}
	public String getVtype() {
		return Vtype;
	}
	public void setVtype(String vtype) {
		Vtype = vtype;
	}
	public String getVnumber() {
		return Vnumber;
	}
	public void setVnumber(String vnumber) {
		Vnumber = vnumber;
	}
	public String getVDOP() {
		return VDOP;
	}
	public void setVDOP(String vDOP) {
		VDOP = vDOP;
	}
	public String getVDOS() {
		return VDOS;
	}
	public void setVDOS(String vDOS) {
		VDOS = vDOS;
	}
	public String getVprice() {
		return Vprice;
	}
	public void setVprice(String vprice) {
		Vprice = vprice;
	}
	public String getVmiles() {
		return Vmiles;
	}
	public void setVmiles(String vmiles) {
		Vmiles = vmiles;
	}
	
	

}

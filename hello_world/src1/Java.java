class Hell
{
	private Heaven angels;
	private Hell guardians;
	public Heaven getAngels() {
		return angels;
	}
	public void setAngels(Heaven angels) {
		this.angels = angels;
	}
	public Hell getGuardians() {
		return guardians;
	}
	public void setGuardians(Hell guardians) {
		this.guardians = guardians;
	}
	
}
class Heaven
{
	private Heaven fairies;
	private Hell hounds;
	private int prisoners;
	public Heaven getFairies() {
		return fairies;
	}
	public void setFairies(Heaven fairies) {
		this.fairies = fairies;
	}
	public Hell getHounds() {
		return hounds;
	}
	public void setHounds(Hell hounds) {
		this.hounds = hounds;
	}
	public int getPrisoners() {
		return prisoners;
	}
	public void setPrisoners(int prisoners) {
		this.prisoners = prisoners;
	}
	
}
public class Java {
	 
	public static void main(String[] args) {
		Heaven heaven[] = new Heaven[5];
		heaven[0].getHounds();
	}
}

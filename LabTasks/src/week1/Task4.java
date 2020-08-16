package week1;

public class Task4 {

	public static void main(String[] args) 
	{
		final double PI=3.14;
		double AreaSphere , VolumeSphere;
		double rad=6;
		AreaSphere = 4*PI*rad*rad; 
		VolumeSphere = (4/3)*PI*rad*rad*rad;
		System.out.printf("AreaSphere = %.4f\n", AreaSphere );
		System.out.printf("VolumeSphere = %.4f\n", VolumeSphere );
	}

}

package basic1;

public class Array_New_Keyword {

	public static void main(String[] args) 
	{
		int counting[];
		counting = new int [12];
		counting[0]=1;
		counting[1]=2;
		counting[2]=3;
		counting[3]=4;
		counting[4]=5;
		counting[5]=6;
		counting[6]=7;
		counting[7]=8;
		counting[8]=9;
		counting[9]=10;
		counting[10]=11;
		counting[11]=12;
		for(int i : counting)
		{
			System.out.println(counting[i]);
		}
		
		

	}

}

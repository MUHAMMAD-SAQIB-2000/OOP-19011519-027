package lambdas;

import java.util.Comparator;

public class CompratorLambda {
	
	public static void main(String[] args) {
		
		//before java 8
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("com1 " + com.compare(21, 45));
		
		//using lambdas
		Comparator<Integer> com2 = (a,b) -> {
			return a.compareTo(b);
		};
		
		System.out.println("com2 " + com2.compare(21, 45));
		
	}
	
}

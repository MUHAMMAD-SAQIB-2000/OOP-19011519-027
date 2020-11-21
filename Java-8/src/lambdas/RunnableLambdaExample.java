package lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		//before java 8
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Run 1");
			}
		};
		
		new Thread(runnable).start();
		
		// after java 8
		Runnable run = () -> {
			System.out.println("Run 2");
		};
		new Thread(run).start();
		
		run = () ->System.out.println("Run 3");
		new Thread(run).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Run 4");
			}
		}).start();
		
		new Thread(() -> System.out.println("Run 5")).start();
	}
}

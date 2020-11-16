package linkedlist.main;

public class MainApplication {

	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(8);
		LinkedListImp list = new LinkedListImp();
		list.addAtIndex(10, 120);
		list.values();
		list.add(45);
		list.add(8);
		list.add(56);
		list.add(80);
		list.values();
		System.out.println("/////////////////////");
		list.addAtStart(120);
		list.values();
		System.out.println("/////////////////////");
		int index = list.getIndex(56);
		System.out.println("Index is:" + index);
		System.out.println("/////////////////////");
		list.addAtIndex(100, 120);
		list.addAtIndex(0, 1200);
		list.addAtIndex(2, 130);
		list.values();
		System.out.println("/////////////////////");
		System.out.println("Count:" + list.size());
	}

}

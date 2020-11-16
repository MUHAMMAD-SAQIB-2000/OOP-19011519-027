package linkedlist.main;

public class LinkedListImp {
	
	Node head;
	Node tail;
	Node current = head;
	int count;
	
	public LinkedListImp(Node node) {
		head = node;
		count = 1;
	}

	public LinkedListImp() {
		head = null;
		tail = null; 
	}
	//1,2,5,3,4
	
	public int size() {
		return count-1;
	}
	
	public void addAtIndex(int index , int data) {
		Node node = new Node(data);
		if( head == null ) {
			System.out.println("List is Empty Insert value");
			return ;
		} else if(index == 0) {
			addAtStart(data);
		} else if(index > count) {
			System.out.println("Index exceeds list limit");
			return ;
		} else {
			Node prev = null;
			Node current = head;
			for(int i = 0 ; i<index ; i++) {
				prev = current;
				current = current.getNext();
			}
			//Node between = node;
			//Node next = current;
			//prev.next = between;
			//between.next = next;
			prev.next = node;
			node.next = current;
		}
		count++;
	}
	
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		if( head == null ) {
			head = node;
		}else {
			Node current = head;
			while(current.getNext()!= null) {//1,2,3, ,4
				current = current.getNext();
			}
			current.setNext(node);
		}
		count++;
	}
	
	public void addAtStart(int data) {
		Node node = new Node(data);
		if( head == null ) {
			System.out.println("List is Empty");
			return ;
		}else {
			//int temp ,a ,b;
			//temp oldHead
			//a head
			//b node
			//temp = a
			//a = b 
			// b = temp
			//a.next = b
			Node temp = head;
			head = node;
			node = temp;
			head.next = node;
		}
		count++;
	}
	
	public int getIndex(int data) {
		if( head == null ) {
			System.out.println("List is Empty");
			return -1;
		}else {
			Node current = head;
			for(int i = 0 ; i<count ; i++) {
				if(current.getData() == data) {
					return i;
				}
				current = current.getNext();
			}
		}
		return 0;
	}
	
	public void values() {
		if( head == null ) {
			System.out.println("List is Empty");
			return ;
		}else {
			Node current = head;
			while(current != null) {//1,2,3
				System.out.println("Data is:" + current.getData());
				current = current.getNext();
			}
		}
	}

}

package com.assignment.linkedlist;

public class LinkedListClass {
	Node head;
	Node tail; 
	int count;

	public LinkedListClass(Node newHead) {
		head = newHead;
		count = 0;
	}

	public LinkedListClass() {
		head = null;
	}

	public void circularListDisplay() {
		Node current = head;
		tail.next = head;
		if(head == null) {
			System.out.println("List is empty");  
			return;
		}else {
			do {
				System.out.println("Circular Linked List Data is:" +current.getData());
				current = current.getNext();
			}while(current != head);
		}
	}

	public static void mergeLinkedList(LinkedListClass list1 , LinkedListClass list2) {
		list1.tail.next = list2.head;
		Node current = list1.head;
		while(current != null) {
			System.out.println("Data is:" +current.getData());
			current = current.getNext();
		}
	}

	public void arithemticAdd() {
		int sum=0;
		Node current=head;
		while(current!=null)
		{
			sum=sum+current.getData();
			current = current.getNext();
		}
		System.out.println("Sum of linked list is Sum="+sum);
	}

	public void add(int newData) {
		Node temp = new Node(newData);
		if(head == null) {
			head = temp;
		}else {
			Node current = head;
			while(current.getNext()!=null) {
				current = current.getNext();	
			}
			current.setNext(temp);
			tail = temp;
		}
		count++;
	}

	public void addAtStart(int data) {
		Node newNode = new Node(data); 
		if(head == null) {    
			head = newNode;  
		}  
		else {    
			Node temp = head;    
			head = newNode;    
			head.next = temp;  
		}
		count++;
	}

	public void insertAtIndex(int index, int data) {
		Node newValue = new Node(data);
		Node current = head;
		Node prev = null;
		if(index == 0) {
			addAtStart(data);
		}else if(index >count) {
			System.out.println("index exceeds Linked list size enter again ");
			return ;
		} else {
			for(int i=0 ; i<index ; i++) {
				prev = current;
				current = current.getNext();
			}		
			prev.next = newValue;
			newValue.next = current;
		}
		count++;
	}

	public void delAtIndex(int index) {
		Node current = head;
		Node prev = null;
		if(head == null) {
			System.out.println("List is empty");  
			return;
		}else if(index == 0){
			delAtStart();
		}else if(index > count) {
			System.out.println("index exceeds Linked list size enter again ");
			return ;
		} else {
			for(int i=0 ; i<index ; i++) {
				prev = current;
				current = current.getNext();
			}		
			prev.next = current.next;
		}
		count--;
	}

	public void delAtStart() {
		if(head == null) {  
			System.out.println("List is empty");  
			return;  
		} else {  
			if(count<1) {  
				System.out.println("count one");
				head = head.next;  
			}  
			else {  
				head = null;  
			}  
		}
		count--;
	}

	public void delAtEnd() {
		Node current = head;
		Node prev = null;
		if(head == null) {
			System.out.println("List is empty");
			return ;
		} else {
			while(current.getNext() != null) {
				prev = current;
				current = current.getNext();
			}
			prev.next = null;
			tail = prev;
			count--;			
		}
	}

	public void valueUpdateAtIndex(int index, int data) {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return ;
		} else if(index == 0){
			head.setData(data);
		}else {
			for(int i=0 ; i<index ; i++) {
				current = current.getNext();
			}
			current.setData(data);			
		}
	}

	public void valueUpdateByData(int dataValue , int newValue) {
		if(head == null) {
			System.out.println("List is empty");
			return ;
		}else {
			Node current = head;
			while(current != null) {
				if(current.getData() == dataValue) {
					current.setData(newValue);
				}
				current = current.getNext();
			}
		}
	}

	public int get(int index) {
		int i=0 ;
		Node current = head;
		if(index<0) {
			return -1;
		}
		while(current.getNext() != null) {
			if(i<index) {
				current = current.getNext();
			}else {
				break;
			}
			i++;
		}
		return current.getData();
	}

	public void searchByData(int data) {
		int counter = 0;
		if(head == null) {
			System.out.println("List is empty");
			return ;
		}else {
			Node current = head;
			while(current != null) {
				if(current.getData() == data) {
					System.out.println("Same Data:"+data+" Has been found at location " +counter);
				}
				current = current.getNext();
				counter++;
			}
		}
	}

	public void getAll() {
		if(head == null) {
			System.out.println("no value ");
			return ;
		}
		Node current = head;
		while(current != null) {
			System.out.print(current.getData() + " " );
			current = current.getNext();
		}
		System.out.println();
	}
	public int getCount() {
		return count++;
	}
}

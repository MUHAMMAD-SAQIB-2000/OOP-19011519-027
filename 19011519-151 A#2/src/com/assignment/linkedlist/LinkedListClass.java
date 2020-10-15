package com.assignment.linkedlist;

public class LinkedListClass {
	Node head;
	int count;

	public LinkedListClass(Node newHead) {
		head = newHead;
		count = 1;
	}

	public LinkedListClass() {
		head = null;
		count = 0;
	}

	public void add(Node newData) {
		Node temp = newData;
		if(head == null) {
			head = temp;
		}else {
			Node currentNode = head;
			while(currentNode.getNext()!=null) {
				currentNode = currentNode.getNext();	
			}
			currentNode.setNext(temp);
		}
		count++;
	}

	public Node get(int index) {
		if(head == null) {
			System.out.println("No Record avalaible");
			return null;
		}
		if(index<=0) {
			System.out.println("Invalid ID");
			return null;
		}
		Node currentNode = head;
		for(int i=1 ; i < index ; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	public void getAll() {
		if(head == null) {
			System.out.println("No Record avalaible");
			return ;
		}
		Node currentNode = head;
		for(int i=1 ; i <= count ; i++) {
			System.out.println("Data is: " + currentNode.toString());
			currentNode = currentNode.getNext();
		}
	}
	public int size() {
		return count;
	}
}

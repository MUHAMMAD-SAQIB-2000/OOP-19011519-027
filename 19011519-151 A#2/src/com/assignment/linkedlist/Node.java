package com.assignment.linkedlist;

public class Node {
	
	private int workerId;
	private String workerName;
	
	Node next;
	
	public Node() {
	}

	public Node(int workerId, String workerName) {
		this.workerId = workerId;
		this.workerName = workerName;
		this.next = null;
	}
	public Node(int workerId, String workerName, Node next) {
		this.workerId = workerId;
		this.workerName = workerName;
		this.next = next;
	}

	

	@Override
	public String toString() {
		return "Node [workerId=" + workerId + ", workerName=" + workerName + "]";
	}

	

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	

}

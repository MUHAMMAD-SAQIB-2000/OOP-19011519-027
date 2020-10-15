package com.assignment.linkedlist;

public class Node {
	
	private int studentId;
	private String studentName;
	private double studentGPA;
	
	Node next;
	
	public Node() {
	}

	public Node(int studentId, String studentName, double studentGPA) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGPA = studentGPA;
		this.next = null;
	}
	public Node(int studentId, String studentName, double studentGPA, Node next) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGPA = studentGPA;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [studentId=" + studentId + ", studentName=" + studentName + ", studentGPA=" + studentGPA + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentGPA() {
		return studentGPA;
	}

	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

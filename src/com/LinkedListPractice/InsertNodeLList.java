package com.LinkedListPractice;

public class InsertNodeLList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
static Node insert(Node head, int data, int position) {
	Node newNode = new Node(data);
	
	if(head == null) {
		return newNode;
	}
	if(position == 0) {
		newNode.next = head;
		return newNode;
	}
	
	Node current = head;
	int currentPosition = 0;
	while(current.next != null && currentPosition < position-1 ) {
		current = current.next;
		currentPosition++;
	}
	
	newNode.next = current.next;
	current.next = newNode;
	return head;
}

public static void main(String[] args) {
	
	Node head = new Node(1);
	Node second = new Node(2);
	Node third = new Node(3);
	head.next = second;
	second.next = third;
	
	int data = 4;
	int position = 1;
	head = insert(head,data,position);
	
	Node current = head;
	while(current != null) {
		System.out.print(current.data+ " ");
		current = current.next;
	}
	
}
}

package com.LinkedListPractice;

public class DeleteANodeLList {
	static class Node{
		int data;
		Node next; 
		Node(int data){
			this.data = data;
		}
	}
	static Node deleteNode(Node head, int target) {
		if(head == null) {
			return null;
		}
		if(head.data == target) {
			return head.next;
		}
		Node current = head;
		Node previous = null;
		while(current != null && current.data != target) {
			previous = current;
			current = current.next;
		}
		if(current == null) {
			return head;
		}
		previous.next = current.next;
		return head;
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		
		int target = 2;
		head = deleteNode(head, target);
		
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	
}

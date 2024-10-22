package com.LinkedListPractice;

public class SearchLinkedlist {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	static Node search(Node head,int target) {
		Node current = head;
		while(current != null) {
			if (current.data == target) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
public static void main(String[] args) {
	Node head = new Node(1);
	Node second = new Node(2);
	Node third = new Node(3);
	head.next = second;
	second.next = third;
	//int target = 2;
	int target = 100;
	Node result = search(head,target);
	if(result != null) {
		System.out.println("Element " + target + " found");
	}
	else {
		System.out.println("Element " + target + " not found");
	}
		
	}
}

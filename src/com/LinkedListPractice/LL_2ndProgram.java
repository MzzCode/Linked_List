//Scratch Implementation 
package com.LinkedListPractice;

	class Node{
		int data;
		Node next;
	
	Node(int data){
	this.data = data;
	this.next = null;
	}
	}
	class LinkedList{
		Node head;
		LinkedList(){
			this.head = null;
		}
		void insert(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
			}
			else {
				Node current = head;
				while(current.next!= null) {
					current = current.next;
				}
				current.next = newNode;
			}
		}
		void display() {
			Node current = head;
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}
	public class LL_2ndProgram {
		public static void main(String[] args) {
			LinkedList list = new LinkedList();
			list.insert(10);
			list.insert(20);
			list.insert(40);
			list.insert(5);
			list.display();
		}
}

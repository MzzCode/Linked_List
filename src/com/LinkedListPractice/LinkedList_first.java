//LinkedList class Implementation (Collection Framework)
package com.LinkedListPractice;
import java.util.LinkedList;
public class LinkedList_first {
    public static void main(String[] args) {
        // Creating a LinkedList instance with generic type String
        LinkedList<String> list = new LinkedList<String> ();

        // Adding elements to the LinkedList
        list.add("is");  // by default add at last          
        list.add("a");             
        list.addLast("list");      
        list.addFirst("this");     
        list.add(3, "linked");     

        // Displaying the elements of the LinkedList
        System.out.println(list);

        // Retrieving and printing the element at index 0
        System.out.println(list.get(0));

        
        System.out.println(list.size());

        // Removing elements from the LinkedList
        list.remove(3);            // Removes the element at index 3
        list.removeFirst();        
        list.removeLast();         

        System.out.println(list);
    }
}


////Define a Node class to represent each element in the linked list
//class Node {
//int value;
//Node next;
//
//// Constructor to initialize a Node with a given value
//Node(int value) {
//   this.value = value;
//   this.next = null;
//}
//}
//
////Define a LinkedList class to represent the linked list structure
//class LinkedList {
//Node head;
//
//// Constructor to initialize an empty linked list
//LinkedList() {
//   this.head = null;
//}
//
//// Method to insert a new element with the given value into the linked list
//void insert(int value) {
//   // Create a new Node with the given value
//   Node newNode = new Node(value);
//
//   // If the linked list is empty, set the new Node as the head
//   if (head == null) {
//       head = newNode;
//   } else {
//       // Traverse the linked list to find the last Node
//       Node current = head;
//       while (current.next != null) {
//           current = current.next;
//       }
//       // Set the next of the last Node to the new Node
//       current.next = newNode;
//   }
//}
//
//// Method to display the elements of the linked list
//void display() {
//   // Start from the head of the linked list
//   Node current = head;
//   // Traverse the linked list and print each element
//   while (current != null) {
//       System.out.print(current.value + " ");
//       current = current.next;
//   }
//   // Print a new line after displaying all elements
//   System.out.println();
//}
//}
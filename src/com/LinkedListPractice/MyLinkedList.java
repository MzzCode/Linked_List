package com.LinkedListPractice;

// Node class represents each node in the linked list
class MyLinkedList {

    private Node head; // The head of the linked list

    // Node class with data and reference to the next node
    private static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    // Insert a new node at the beginning of the linked list
    public void insertAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.Next = head;
        head = new_node;
    }

    // Insert a new node after a specified node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.Next = prev_node.Next;
        prev_node.Next = new_node;
    }

    // Insert a new node at the end of the linked list
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            // If the list is empty, the new node becomes the head
            head = new Node(new_data);
            return;
        }
        new_node.Next = null;
        Node last = head;
        while (last.Next != null)
            last = last.Next;

        last.Next = new_node;
    }

    // Delete a node at a specified position
    void deleteNode(int position) {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            // If the node to be deleted is the head
            head = temp.Next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.Next;

        if (temp == null || temp.Next == null)
            return;

        Node next = temp.Next.Next;
        temp.Next = next;
    }

    // Search for a node with a specified key
    boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.Next;
        }
        return false;
    }

    // Sort the linked list using bubble sort
    void sortLinkedList() {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.Next;

                while (index != null) {
                    if (current.data > index.data) {
                        // Swap data if the current node's data is greater
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.Next;
                }
                current = current.Next;
            }
        }
    }

    // Print the elements of the linked list
    public void printList() {
        Node tnode = head;   //This line initializes a temporary variable tnode with the head of the linked list. 
                             //This is done to avoid modifying the actual head of the list while traversing it.
        
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.Next;
        }
    }

    // Main method for testing the linked list operations
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insertAtEnd(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtEnd(4);
        list.insertAfter(list.head.Next, 5);

        System.out.println("Linked list: ");
        list.printList();

        System.out.println("\nAfter deleting an element: ");
        list.deleteNode(3);
        list.printList();

        System.out.println();
        int item_to_find = 3;
        if (list.search(item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

        list.sortLinkedList();
        System.out.println("\nSorted List: ");
        list.printList();
    }
}

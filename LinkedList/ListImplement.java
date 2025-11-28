package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListImp {
    private Node head;
    private Node start;
    private Node tail;

    // Insertion At Head
    void insertAtHead(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        start = head;
    }

    // Insertion at End
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // It prevents from adding directly a new-node at end and handle the exception!
        if (head == null) {
            head = newNode;
            start = head;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insertion at any place in the linkedlist!
    // Case : 01 (Insertion by Index)

    // Counting the no. of node in the linkedlist
    int countNode() {
        int count = 0;
        Node temp = start;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtPos(int pos, int data) {

        Node newNode = new Node(data);

        try {
            if (pos == 0)
                insertAtHead(data);

            else if (pos == countNode()) {
                insertAtEnd(data);
            } else {
                Node temp = head;
                int count = 0;

                while (count < pos - 1) {
                    temp = temp.next;
                    count++;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }

        } catch (Exception e) {
            System.out.println("Index out of bound exception !");
        }

    }

    void displayList() {
        Node temp = start;

        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }
}

public class ListImplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedListImp list = new LinkedListImp();

        // list.insertAtHead(10);
        // list.insertAtHead(56);
        list.insertAtHead(97);
        list.insertAtHead(82);
        list.insertAtEnd(20);

        int count = list.countNode();
        System.out.println("No. of Node in the list is : " + count);

        System.out.println("Enter Position to Enter value : ");
        int pos = input.nextInt();
        list.insertAtPos(pos, 104);
        list.displayList();

        count = list.countNode();
        System.out.println("\nNo. of Node in the list is : " + count);

    }
}

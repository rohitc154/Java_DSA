package LinkedList;

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

public class ArrToList {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1 };

        for (int i = 0; i < arr.length; i++) {
            Node y = new Node(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
        }
    }
}

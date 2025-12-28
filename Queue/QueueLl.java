class Node{
    int data;
    Node next;


    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class QueueImp{
    Node front;
    Node rear;
    void enqueue(int data){
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if (front == null)
            throw new RuntimeException("Queue is Empty");

        int val = front.data;
        front = front.next;

        if (front == null)
            rear = null;
        return val;
    }

    boolean isEmpty(){
        return front == null;
    }


    void display(){
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
}

public class QueueLl {
    public static void main(String[] args) {
        QueueImp queue = new QueueImp();

        queue.enqueue(45);
        queue.enqueue(95);
        queue.enqueue(23);
        queue.dequeue();

        queue.display();
    }
}

class Queue{
    int size;
    int front  = 0;
    int rear = -1;
    int queue[];

    Queue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int data){
        if (rear == queue.length-1) {
            System.out.println("Cannot Enter into Queue !");
            return;
        }
        queue[++rear] = data;
    }

    int dequeue(){
        if (front > rear) {
            throw  new RuntimeException("Queue is Empty !");
        }
        int val = queue[front++];

        if(front > rear){
            front = 0;
            rear = -1;
        }

        return val;
    }

    int peek(){
        if (front > rear) throw  new RuntimeException("Queue is Empty !");

        return queue[front];
    }


    void display(){
        int temp = front;
        while (temp <= rear) {
            System.out.print(queue[temp]+"  ");
            temp++;
        }
        System.out.println();
    }

    boolean isEmpty(){
        return front > rear;
    }
}

public class basic01 {
    public static void main(String[] args) {
        Queue queue = new Queue(6);

        queue.enqueue(45);
        queue.enqueue(97);
        queue.enqueue(23);
        queue.enqueue(18);

        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        // queue.display();
        
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}

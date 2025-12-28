class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

class Stack{
    Node top;
    void push(int data){
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if (top == null) throw new RuntimeException("Stack Empty");
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek(){
        if (top == null)
            throw new RuntimeException("Empty Stack !");
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    void display(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
}

public class stackLinkList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        // s.pop();
        s.pop();
        s.push(80);

        System.out.println(s.peek());

        s.display();
    }
}

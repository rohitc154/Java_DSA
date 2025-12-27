class Stack {
    private int[] stack;
    private int top;

    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == stack.length - 1;
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class basic02Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();   // 10 20 30
        System.out.println(s.pop()); // 30
        System.out.println(s.peek()); // 20
    }
}

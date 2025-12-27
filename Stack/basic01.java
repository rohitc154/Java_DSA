import java.util.Scanner;


class stackImp{
    int point = -1;
    void push(int[] stack, int data){
        if (point < stack.length-1) {
            ++point;
            stack[point] = data;
        }
        else {
            System.out.println("Cannot Push Value !");
        }
    }

    void display(int[] stack){
        for (int i = 0; i <= point; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("");
    }

    void pop(){
        if (point == -1) {
            System.out.println("Stack Underflow !");
            return;
        }
        point--;
    }

}

public class basic01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size of Stack : ");
        int size = input.nextInt();

        int stack[] = new int[size];

        stackImp stackObj = new stackImp();

        stackObj.push(stack, 45);
        stackObj.push(stack, 34);
        stackObj.push(stack, 645);
        stackObj.pop();
        // stackObj.pop();
        stackObj.push(stack, 345);


        stackObj.display(stack);
    }
}

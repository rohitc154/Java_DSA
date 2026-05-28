
import java.util.Scanner;

public class Prob1518 {
    static int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            drank +=1;
            empty = empty-numExchange+1;            
        }

            // Another Way !!
    //     while (empty >= numExchange) {
    //     int newFull = empty / numExchange;   // how many full bottles we can trade
    //     drank += newFull;                    // drink them
    //     empty = empty % numExchange + newFull; // leftover empties + new empties
    // }
        return drank;
    }



    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter No. Bottles : ");
            int numBottles = input.nextInt();
            System.out.println("Enter Exchange Value : ");
            int numExchange = input.nextInt();
            System.out.printf("You can drink %d bottles.", numWaterBottles(numBottles, numExchange));
        }
    }
}

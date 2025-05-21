/*
**********
 ******* 
  *****  
   ***   
    *    
 */
public class Pattern08 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Printing space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing star
            for (int j = 0; j < (n * 2) - (i * 2) - 1; j++) {
                System.out.print("*");
            }
            // Printing space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

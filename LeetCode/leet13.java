public class leet13 {

  public static void main(String[] args) {
    String s = "MCMXCIV";
    int[] arr = new int[s.length()];
    int sum = 0;

    for (int i = 0; i < s.length(); i++) {
      String Uval = Character.toString(s.charAt(i)).toUpperCase();
      switch (Uval) {
        case "I": arr[i] = 1; break;
        case "V": arr[i] = 5; break;
        case "X": arr[i] = 10; break;
        case "L": arr[i] = 50; break;
        case "C": arr[i] = 100; break;
        case "D": arr[i] = 500; break;
        case "M": arr[i] = 1000; break;
        default:
          System.out.println("Enter Correct Value!");
          return;
      }
    }

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        sum -= arr[i];  // subtract if smaller than next
      } else {
        sum += arr[i];  // add otherwise
      }
    }

    sum += arr[arr.length - 1];

    System.out.println("Sum is : " + sum);
  }
}

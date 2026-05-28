public class Prob151 {

//   public static String reverseWords(String s) {
//     String[] strArr = s.trim().split("\\s+");

//     int left = 0;
//     int right = strArr.length - 1;

//     while (left < right) {
//       String temp = strArr[left];
//       strArr[left] = strArr[right];
//       strArr[right] = temp;

//       left++;
//       right--;
//     }

//     return String.join(" ", strArr);
//   }

//   public static void main(String[] args) {
//     String str = "  hello    world  ";

//     String result = reverseWords(str);

//     System.out.println(result);
//   }


// Opitmization level two:


  public static String reverseWords(String s) {
    String[] words = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();

    for(int i=sb.length(); i>=0; i--){
        sb.append(words[i]);
        if (i != 0) {
            sb.append(" ");
        }
    }

    return sb.toString();
  }
}

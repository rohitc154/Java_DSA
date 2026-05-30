/*You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string. */

public class Prob1528 {
    public static  String restoreString(String s, int[] indices) {
        String sffleStr = "";
        char[] chArr = s.toCharArray();
        char[] newArr = new char[s.length()];

        for(int i=0; i<chArr.length; i++){
            newArr[indices[i]] = chArr[i];
        }

        for(char e:newArr){
            sffleStr += e;
        }
        return sffleStr;
    }
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s, indices));
    }
}

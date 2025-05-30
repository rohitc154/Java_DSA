package Hashing;

public class BasicHas {
    public static void main(String[] args) {
        // -----------") String Basic Hashing
        String name = "Rohit";
        int code = name.hashCode();
        System.out.println("Code is : " + code);

        // ---------------:) Integer Basic Hashing
        // int a = 45367; // cannot invoke hashcode() in primitive datatypes
        Integer a = 45367;
        System.out.println(a.hashCode());
    }
}

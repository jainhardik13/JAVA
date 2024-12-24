import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
        int len = s1.length();
        String newString = s1.concat("All");
        System.out.println(newString);
        s1 = newString;
        boolean starts = s1.startsWith("He");
        boolean ends = s1.endsWith("llo");
        boolean contains = s1.contains("night");
        String sub = s1.substring(2);
        System.out.println(sub);
        int indexof = s1.indexOf("lo");
        System.out.println(indexof);
        indexof = s1.indexOf("gfc");
        String large = "This is string. This is example.";
        String small = "is";
        String ar[]  = {"Sumit", "Rajan" , "Nisha" , "Suneeta" , "Kartik"};
        // 1. print all strings with odd length from array ar
        // 2. print all strings which starts with "S" or "s" from array ar
        // 3. print all strings that ends with "a" from array ar
        // 4. print the strings in reverse order from array ar
        // 5. print all indexes where small string is found in large string
    }
}

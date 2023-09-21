
    import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        
        /*   Problem 2:  Determine whether a given string is Palindrome */

        System.out.println("Enter The String Value");
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        String reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println("True");
    }
    else {
      System.out.println("False");
    }
        
        
        
    }
    
}

    


public class SwappingStrings {
    public static void main(String[] args) {
        
        /*   Problem 4:  Swap two Strings Without Using any Third Variable */

        String a ="Hello";
        String b="World";

        System.out.println("Befor swap String Value:-"+a+b);
        System.out.println("-------------------Swap------------------------");

        a=a+b;
        b=a.substring(0, a.length()-b.length());
        
        a=a.substring(b.length());
        System.out.println("String Value After swap:-"+a+b);
        




    }
}
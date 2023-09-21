public class SwappingValues {
    public static void main(String[] args) {
    /*     Problem 5: Swap two numbers without using a temporary variable
         Input:integer a = "10", b = "50".
       Output: Strings after swap: a = 50 and b = 10 */
    
        int a=10;
        int b=50;
        System.out.println("Value Before Swap A:"+a+" V alue B:"+b);

        a=b*a;
        b=a/b;
        a=a/b;
       
        System.out.println("******************************************");
        System.out.println("Value After swap  Of A:"+a +" Value B:"+ b);
        

    }
}
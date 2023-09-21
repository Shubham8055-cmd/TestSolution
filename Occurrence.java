
    import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
       
        /*Problem 1: Program to count occurrences of a given character in a string.
         Please enter only GeeksforGeeks ,abccdefgaa. For Best Result */
         
        System.out.println("Enter The String");
        Scanner sc=new Scanner(System.in);
        String Name = sc.next();
        char c='e';
        char d='a';
        int res=0;
        int reslt=0;
        

        for(int i=0;i< Name.length();i++){

            if(Name.charAt(i)==c){
               
                res++;
                
            }
            
            else if(Name.charAt(i) == d){
                
                reslt++;
                
            }
        }
         System.out.println(" Output: "+res);
        
         System.out.println("Output:"+reslt);
        

        
    }

}


public class Solution1Array {
    public static void main(String[] args) {
        int numbers[] = new int[]{1,2,3,4,5};
        
/*Problem 3:  Biggest and smallest number in an array*/


        int smallest = numbers[0];
        int largetst = numbers[0];
      
        for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] > largetst){
             
             largetst = numbers[i];
         }
         else if (numbers[i] < smallest){

             smallest = numbers[i];

         }
        }
      
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
        
    }
}
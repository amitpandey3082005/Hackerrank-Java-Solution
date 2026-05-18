import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Range of data type can be calculated as -2^n to -2^n - 1 n--> no of bits.
        
         Scanner sc = new Scanner(System.in);
    while(sc.hasNextInt()){
        // taking no of test case t 
         int t = sc.nextInt();
         // using itreation to check data type that can be fitted 
         for(int i=0;i<t;i++){
            
            try{
              // read input as long 
             long n = sc.nextLong();
             System.out.println(n+ " can be fitted in:");
              if (n>= Math.pow(-2, 7) && n<=Math.pow(2, 7)-1){
                System.out.println("* byte"); // 8 bit integer
              }
              if(n>= Math.pow(-2, 15) && n<=Math.pow(2, 15)-1){
                System.out.println("* short");  // 16 bit integer
              }
            
              if(n>= Math.pow(-2, 31) && n<=Math.pow(2, 31)-1){
                System.out.println("* int"); // 32bit integer
              }
             
              if(n>= Math.pow(-2, 63) && n<=Math.pow(2, 63)-1){
                 System.out.println("* long");   
              }
             
            }catch(InputMismatchException e){
               // for very large input it can not assign n so to read them we use sc.next() 
               System.out.println(sc.next()+" can't be fitted anywhere.");   
            }
         
         } 
     }      
    }
}

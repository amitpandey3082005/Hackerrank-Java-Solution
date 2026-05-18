import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
              if (n>= Byte.MIN_VALUE && n<=Byte.MAX_VALUE){
                System.out.println("* byte");
              }
              if(n>= Short.MIN_VALUE && n<= Short.MAX_VALUE){
                System.out.println("* short");  
              }
            
              if(n>= Integer.MIN_VALUE && n<=Integer.MAX_VALUE){
                System.out.println("* int");
              }
             
              if(n>= Long.MIN_VALUE && n<= Long.MAX_VALUE){
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

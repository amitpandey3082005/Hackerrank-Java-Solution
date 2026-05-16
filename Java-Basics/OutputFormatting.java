import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s = sc.next();
            int x = sc.nextInt();
            
            System.out.printf("%-15s%03d\n", s , x);
        }
        System.out.println("================================");
    }
}


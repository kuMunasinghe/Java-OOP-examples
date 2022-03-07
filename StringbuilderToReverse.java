//mport java.io.*;
import java.util.*;

public class StringbuilderToReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        reverse(A);

    }
    
    static void reverse(String kelin){
        StringBuilder sb=new StringBuilder(kelin);  
         sb.reverse(); 
          String result = sb.toString(); 
         if (result==kelin){
             System.out.println("Yes");
         }
         else{
             System.out.println("No");
         }
       
    }
}


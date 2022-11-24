package fourques;

import java.util.*;
public class anagram {
   public static void main(String []args){

        int a = 26;
        int ar[] = new int[a];
        int ar1[] = new int[a];
        int arary = 0;

        for(int i =0;i<ar.length;i++)
        {
            ar[ar[i]-97]++;
            
        }
        System.out.println(ar);        
   } 
}

package interview.interview.java;

import java.util.Scanner;

public class reverse {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        String a=sc.nextLine();
        String b ="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        System.out.println(b);
        // int a1 =1143;
        // int rev=0;
        // while(a1!=0){
        //     int tp=a1%10;
        //     rev=rev*10+tp;
        //     a1=a1/10;
        // }
        // System.out.println(rev);
        // sc.close();
        int n = 9586;
        int rev= 0;
        while(n!=0){
            int n1 = n%10;
            rev=rev*10+n1;
            n = n/10;
        }
        System.out.println(rev);
          sc.close();
    }
}

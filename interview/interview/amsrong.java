package interview.interview;
import java.util.*;
public class amsrong {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int temp = n;
        int a =0;
      int cnt =0;
        int c =0;
        int b=0;
        while(n!=0){
            a = n%10;
            cnt++;
            n=n/10;
        }
        for(int i=0;i<cnt;i++){
            c = temp%10;
            b = b+(int)Math.pow(c,cnt);
            temp= temp/10;
        }
        System.out.println(b);
        sc.close();
    }
}

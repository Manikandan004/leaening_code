package condition.looping;
import java.util.*;
public class farisfrancies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int del =0;
        int div =0,shift=0;;
        int ar[] = new int[n];
        for(int i = 0;i<n;i++){
            ar[i] = sc.nextInt();
            sum=sum+ar[i];
        }
        div = sum/n;
        del = sum-(div*n);
        for(int i = 0; i<n;i++){
            if(ar[i]<div){
                while(div!=ar[i]){
                    ar[i]++;
                    shift++;
                }
            }
            else if(ar[i]>div){
                ar[i]=div;
            }
        }
        System.out.println(del+" "+shift);
        sc.close();
    }
}

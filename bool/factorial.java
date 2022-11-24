package bool;
import java.util.*;
public class factorial {
    public static void main(String []  ar){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n =0;
        for(int i=0;i<a-1;i++){
           if(i==a){
            System.out.println(1);
           }
           else{
               System.out.println(i);
           }
        }
    }
}

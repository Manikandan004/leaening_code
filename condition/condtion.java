package condition;
import java.util.*;
public class condtion {
    public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
     if( b>500){
        int d4 = 50/b*100;
        System.out.println(d4);
     }
     else if(b>=50 && b<=100){
         int d = 10/b *100;
         System.out.println(d);
     }
     else if(b>=101 && b<=200){
         int d1 = 20/b *100;
         System.out.println(d1);
     }
     else if(b>=201 && b<=400){
         int d2 = 30/b *100;
         System.out.println(d2);
     }
     else if(b>=401 && b<=500){
         int d3 = 40/b *100;
         System.out.println(d3);
     }
     else if(b>500){
        System.out.println("no discount");
     }

    }
}

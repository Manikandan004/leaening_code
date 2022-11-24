package condition;
import java.util.*;
public class check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        if(a==a1 && b==b1 && c==c1){
            System.out.println(a+" "+b+""+c);
        }
        else if(a==a1 && b!=b1 && c==c1){
            System.out.println(a+" "+c);
        }
        else if(b==b1 && c!=c1 && a==a1){
            System.out.println(b+" "+a);
        }
        else if(c==c1 && b==b1 && a!=a1){
            System.out.println(c+" "+b);
        }
        else if(a==a1 || b==b1 || c==c1){
            System.out.println("Satisfied");
        }
        else{
            System.out.println("0");
        }
        
    }
}

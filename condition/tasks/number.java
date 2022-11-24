package condition.tasks;
import java.util.*;
public class number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
    
        int even = 0;
        int odd = 0;
        System.out.println(s);
        int  v = Integer.parseInt(s);
        for(int i=0;i<s.length();i++){
            // if(s.charAt(i)%2==0){
            //     even+=Integer.parseInt(s.charAt(i)+"");
            // }
            // else{
            //     odd +=Integer.parseInt(s.charAt(i)+"");
            // }
            int f = v-1;
           
        }
        
        // int d = even-odd;
       
        // System.out.println(Math.abs(d));
        String c ="";
        for(int i =s.length()-1;i>=0;i--){
            c =c+s.charAt(i);
        }
        System.out.println(c);
        
        if(s.equals(c)){
        System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindorme");
        }
        
        // <!--least possiblity palindrome-->

        
    }
}

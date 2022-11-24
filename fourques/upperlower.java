package fourques;
import java.util.*;
public class upperlower {
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        char ch;
        String s = sc.next();
        
        for(int i =0;i<s.length();i++){
            if(s%2==0){
                System.out.print(s.toUpperCase());
            }
            else{
               continue;
            }
        }
    }
}

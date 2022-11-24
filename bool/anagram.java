package bool;
import java.util.*;
public class anagram {
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        
        String v  =  sc.nextLine();
        char a1;
        char b1;
        int a =s.length();
        int b =v.length();
        if(s.length() == v.length()){
        for(int i =0;i<a;i++){
          a1= s.charAt(i);
           b1 =v.charAt(i);

          if(a1==b1 ){
              System.out.println("String is Anagram");
          }

        }
    }
          else{
              System.out.println("String is not anagram");
          }

       
    }
}

package array;
import java.util.*;
public class usrinput {
  static int n=0;
  static int userinput=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
         userinput = sc.nextInt();
       
        if(userinput%100==0){
          n = userinput/2000;
          userinput= userinput%2000;//500
          
          
          // userinput += userinput%500;

          
            System.out.println("2000 "+ n);
          n = userinput/500;
            System.out.println("500 "+n);
          userinput = userinput%500;

          n = userinput/100;
            System.out.println("100 "+n);
          userinput = userinput%100;
        }
        else{
          System.out.println("Invalid input");
        }
          

          
        

       
}
}

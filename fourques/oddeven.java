package fourques;
import java.sql.Array;
import java.util.*;
public class oddeven {
    public static void main(String []  args){
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        int ar[] = new int[a];
     
        for(int i = 0;i<a;i++)
        {
            ar[i] = sc.nextInt(); 
        }
        for(int i =0;i<a;i++)
        {
          if(i%2!=0)
          {
            System.out.print(ar[i]+" ");
          }  else{
               continue;
          }  
        }
        for(int i =0;i<a;i++)
        {
          if(i%2==0)
          {
            System.out.print(ar[i]+" ");
          }  else{
               continue;
          }  
        }    
    }
}

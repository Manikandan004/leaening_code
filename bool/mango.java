package bool;
import java.util.*;
public class mango {
    static void findsum(String a){
        String a1="";
        String a2="";
        int vow=0;int cont = 0;
        char a3;
        for(int j =0;j<=a.length();j++){
            for(int i=j+1;i<=a.length();i++){
            
                a2 = a.substring(j,i);
                System.out.println(a2);
                a3=a2.charAt(0);

                if(a3=='a' || a3== 'e' || a3=='i' || a3=='o' || a3=='u'){
                    vow++;
                }
                else{
                    cont++;
                }
                
            }
    }
    System.out.println("vowels"+" " +vow);
    System.out.println("constant"+" "+cont);
    if(vow>cont){
        System.out.println(vow);
    }
    else{
        System.out.println(cont);
    }
        
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a =  sc.nextLine().toLowerCase();
    
        findsum(a);
    }
}

package condition;
import java.util.*;
public class Cons {
     String name;
     int reg_no;
     Cons(String name, int reg_no){
        this.name = name;
        this.reg_no = reg_no;
    }
    
    public Cons(){}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cons[] con = new Cons[n];
        for(int i=0;i<n;i++){
            con[i] = new Cons();
            con[i].name = sc.next();
            con[i].reg_no= sc.nextInt();
            sc.nextLine();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
            if(con[i].reg_no>con[j].reg_no ){
                Cons temp = con[i];
                con[i] = con[j];
                con[j] = temp;
            }
            
            System.out.println(con[i].name+"  "+con[i].reg_no);
    
        }
    
        sc.close();

    }
    }
}

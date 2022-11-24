package array;
import java.util.*;
public class sample {
    String name;
    int pass;
    static ArrayList<sample> u_sam = new ArrayList<>();
    sample(String name, int pass){
        this.name = name;
        this.pass =pass;
    }
    public static void main(String [] arg){
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        int pass = sc.nextInt();
        u_sam.add(new sample(name, pass));
        System.out.println(u_sam.get(0).name+" "+u_sam.get(0).pass);
        String name1 = sc.nextLine();
        int pass1 = sc.nextInt();
        u_sam.add(new sample(name, pass));
        System.out.println(u_sam.get(1).name+" "+u_sam.get(1).pass);
        
    }
}

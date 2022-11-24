package interview.interview.java;
import java.util.*;
public class binary {
    public static void main(String[] args) {
        String map="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        String n = "";
        for(int i=0;i<s.length();i++){
            n+=String.format("%8s",Integer.toString(s.charAt(i),2)).replace(" ", "0");
        }
        System.out.println(n.length());
        int len=6-(n.length()%6)+n.length();
        String res=String.format("%"+ -len+"s",n).replace(" ", "0");
        System.out.println(res.length());
        for(int i=0;i<res.length();i+=6){
            String tp=res.substring(i,i+6);
            System.out.println(i+"->"+map.charAt(Integer.parseInt(tp,2)));
        }
        sc.close();
    }
}

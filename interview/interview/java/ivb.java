package interview.interview.java;

import java.util.*;
public class ivb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n =sc.nextLine();
        int cnt=0;
        for(int i =0;i<n.length()-1;i++){
            cnt+= Math.pow(Integer.parseInt(n.charAt(i)+""),Integer.parseInt(n.charAt(i+1)+""));
        }
        cnt+= Math.pow(Integer.parseInt(n.charAt(n.length()-1)+""),Integer.parseInt(n.charAt(0)+""));
        System.out.println(cnt);
        sc.close();
    }
}

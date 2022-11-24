package fourques;
import java.util.*;
public class countalphabets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // char ch[] = new char[a.length()];
        // for(int i =0;i<a.length();i++){
        //     ch[i] = a.charAt(i);
        //     System.out.print(ch[i]+",");
        // }
        // for(int i =0;i<a.length();i++){
        //     int count=1;
        //     for(int j = i+1;j<a.length();j++){
        //         if(ch[i]==ch[j]){
        //             count++;
        //             ch[i]=0;
        //         }
        //     }
        //     System.out.println("");
        //     if(ch[i]!=0){
        //         System.out.println(ch[i]+" "+count);
                
        //     }
        // }
        // Alternate
        int con=0;
        for(char al='a';al<='z';al++){
            for(int j =0;j<a.length();j++){
                if(al==(a.charAt(j))){
                    con++;
                }
            }
            if(con>0){
                System.out.println(al+" "+con);
                con=0;
            }
        }

    }  

}

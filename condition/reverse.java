package condition;
import java.util.*;

public class reverse {
    static void rev(String s){
        String empty = "";
        char ch = 0;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            empty = ch+empty;

        }
        System.out.println(empty);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        rev(s);
        
    }
}

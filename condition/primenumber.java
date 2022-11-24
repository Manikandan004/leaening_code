package condition;
import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        for (int j = 2; j <= a; j++) {
            boolean flg = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flg = false;
                }
            }
            if (flg) {
                s = s + j + " ";
            }
        }
        // String s = "2 3 5 7 11 13 17";
        // char ar[] = s.toCharArray();
        // System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(s.split(" ")));
    }
}

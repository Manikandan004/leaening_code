import java.util.*;

public class arraysplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int slits = n / 2;
        int max = ((slits + 1) * ((n - slits) + 1));
        System.out.println(max);
    }
}

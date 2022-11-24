package interview.interview.java;
import java.util.*;
public class matholympaid {

    static int summation(int n){
      return n*(n+1)/2;
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    while(m!=0){
      n = summation(n);
      --m;

    }
    System.out.println(n);
    sc.close();
}
}


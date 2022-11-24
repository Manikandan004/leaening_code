package interview.interview.java;

public class fibo {
    public static void main(String[] args) {
        int n1 =10;
        int n2 =0;
        int n3 =1;
        int n4=0;
        System.out.println(n2); 
        System.out.println(n3); 
        for(int i = 2;i<n1;i++){
         n4 = n2+n3;
         System.out.println(n4);
        n2=n3;
        n3=n4;

        }
    }
}

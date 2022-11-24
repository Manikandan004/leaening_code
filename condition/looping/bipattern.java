    package condition.looping;

    import java.util.*;

    public class bipattern {
        public static void main(String[] mani) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) 
                {
                    if(i==a-1)
                        System.out.print("*");
                    else if(i+j==a-1)
                        System.out.print("*");
                    else if(i+j>=a-1)
                        System.out.print("i");
                    else if(i+j<=a-1)
                        System.out.print("b");
                    
                }
                for (int j=1 ;j<a;j++) {
                    if(i==a-1)
                        System.out.print("*");
                    else if(i==j)
                        System.out.print("*");
                    else if(i>j)
                        System.out.print("i");
                    else if(i<j)
                        System.out.print("b");
                }
                System.out.println("");
            }
        }
    }

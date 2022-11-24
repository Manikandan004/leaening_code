package bool;
import java.util.*;
public class seat {
    public static void main(String[]agrs){
        Scanner s =new Scanner(System.in);
        int ar[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ar[i][j] = s.nextInt();

            }
        }
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(ar[i][j]);
        }
    }
        
    }
}

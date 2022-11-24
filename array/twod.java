package array;
import java.util.*;

public class twod {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int ar[][] = new int[4][4];
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(ar[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        ArrayList<ArrayList<Integer>> amd = new ArrayList<>();
        
        for(int i =0;i<4;i++){
            ArrayList<Integer> sk=new ArrayList<>();
            for(int j = 0;j<4;j++){
                sk.add(0);
            }
            amd.add(sk);
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(amd.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

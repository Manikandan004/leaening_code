import java.util.*;
public class jav{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for(int  i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x =sc.nextInt();
        arr[2]=arr[2]+x;
        int cnt=0;
        System.out.println("");
        ArrayList<Integer> k = new ArrayList<>();
        for(int i=0;i<n;i++){
            // System.out.print(arr[i]);
            k.add(arr[i]);
            if(k.get(i)<n){
                cnt++;
            }
        }
        for(int i=0;i<n;i++){
        if(cnt!=arr[i]){
            continue;
        }
        else{
            cnt++;
        }
    }
        System.out.println(cnt);
        

    }
}
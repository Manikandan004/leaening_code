package condition;
import java.util.Arrays;

public class swapping {
    public static void main(String[] args){
    int a[] = {4,3,8,2,7};
    for(int i = 0;i<a.length;i++){
        for(int j = i+1;j<a.length;j++){
            if(a[i]>a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

    }
    for(int i:a){ //for each loop
        System.out.println(i);
    }
    System.out.println(Arrays.toString(a));
    }
}

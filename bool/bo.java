package bool;

    import java.util.*;
 class bo {
    static boolean tak1(String a){
        int c=0,c1=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)%2==0){
                c++;
            }
            else{
                c1++;
            }
        }
        if(c>=c1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        String a1 =  sc.next();
        System.out.println(tak1(a1));

        
    }
}



package fourques;

public class pnum {
    public static void main(String[] ars)
    {
        int a =100;
        for(int i = 2;i<=a;i++){
            boolean flag =true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }

            }
            if(flag)
            System.out.println(i);
        }
    }
}

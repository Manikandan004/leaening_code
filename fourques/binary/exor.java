package fourques.binary;

 public class exor {
    public static void main(String [] ag){
                    //binary
        int a = 10; //1010(8 4 2 1)
        int b = 20; //10100
        a++;  //1011
        a=a^b;
        b=a^b;
        System.out.println(a+" "+b);
    }
}

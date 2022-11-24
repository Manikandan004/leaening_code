package fourques.binary;

public class lcmgcd {
    static int gcd(int a , int b){
        if(b==0){
            return a;
        }
    
        return gcd(b,b%a);
    
    }
    static int lcm(int a1, int b1){
        int c = (a1*b1)/gcd(a1,b1);
        return c;
    }
    public static void main(String [] args){
        int ar[] = new int[]{2,4,6,8};
        for(int i =0;i<ar.length-1;i++){
            System.out.println(gcd(ar[i],ar[i+1])+" "+lcm(ar[i],ar[i+1]));
           
            
        }
        
    }
}

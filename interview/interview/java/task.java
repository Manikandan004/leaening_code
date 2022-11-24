package interview.interview.java;

public class task {
    public static void main(String[] args) {
        int n[] ={2,3,2,1,1,2};
        String a ="";
        for(int i =0;i<n.length-1;i++){
            for(int j=i+1;j>0;j++){
                if(n[i]==n[j]){
                    System.out.println("*");
                }
                else{
                    System.out.println(n[j]);
                }
            }
        }

            // System.out.println(a);
        
    }
}

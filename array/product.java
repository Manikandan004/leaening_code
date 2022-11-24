package array;
import java.util.*;
public class product {
    private static Scanner sc;
    static String pro_name,pro_company;
    static String pro_prize;
    static String pro_nickname;
   
    // static ArrayList<String> company = new ArrayList<String>();
    // static ArrayList<Integer> prize = new ArrayList<Integer>();
    static ArrayList<ArrayList<String>>product_details = new ArrayList<ArrayList<String>>();
    public static Object addProduct;
    static void amazon_product(){
        int n=0;
        System.out.println("1.Add product");
        System.out.println("2.Update offer");
        System.out.println("3.Exit");
        System.out.println("Enter your choice : ");
        n=sc.nextInt();
        switch(n){
            case 1:
                addProduct();
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
        }
    }

    //addProdcut
    static void addProduct(){
         ArrayList<String> pro_details = new ArrayList<String>();
        sc.nextLine();
        System.out.print("Enter your product name : ");
        pro_name = sc.nextLine();
        pro_details.add(pro_name);
        System.out.print("2.Company Name : ");
        pro_company = sc.nextLine();
       pro_details.add(pro_company);
        System.out.print("3.Product prize : ");
        pro_prize = sc.nextLine();
        pro_details.add(pro_prize);
        product_details.add(pro_details);
        
        System.out.println(product_details);
        amazon_product();

    }
    //update
    static void Update(){
        for(int i=0;i<product_details.size();i++){
     
        }
    }

    public static void main(String[] args){
        sc =  new Scanner(System.in);
        amazon_product();
        User buyer = new User();

    }
}
class User{

}

// //printf("%-10s%-10s%-10s\n","User","BRand");
// for(i=0;i<product_details.size();i++){
//     System.out.printf("%-10s",i+1);
//     for(int j =0 ;j<5;j++){
//         System.out.println("%-10s",product_details.get(i).get(j));
//     }
//     system.out.print("\n");
// }
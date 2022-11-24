package array;
import java.util.*;

public class buyer {
    private static Scanner sc;
    static String name,name1;
    static int password,password1;
    static ArrayList<String> user_name = new ArrayList<String>();
    static ArrayList<Integer> user_pass = new ArrayList<Integer>();
    static void userInput(){
        int n=0;
                System.out.println("1.New User");
                System.out.println("2.Exciting user");
                System.out.println("3.Exit");
                System.out.print("Enter your choice ");
                n = sc.nextInt();
                switch(n){
                    case 1:
                        newUser();
                        break;
                    case 2:
                        exicitingUSer();
                        break;
                    case 3:
                        System.exit(0);
                }
    }
    //new user
    static void newUser(){
    sc.nextLine();
    System.out.println("Enter your name : ");
    name =  sc.nextLine();
    user_name.add(name);
    System.out.println("Enter your password : ");
    password = sc.nextInt();
    user_pass.add(password);
    System.out.println("Account added successfully..!");
    userInput();
    }

    //exciting user
    static void exicitingUSer(){
        sc.nextLine();
        System.out.println("Enter your name : ");
        name1 =  sc.nextLine();
        System.out.println("Enter your password : ");
        password1 = sc.nextInt();

        if(user_name.contains(name1) && user_pass.contains(password1)){
            userHome();
        }
        else{
            System.out.println("Invalid user, Create an account..!");
            userInput();
        }
    }

    //Userhomepage
    static void userHome(){
        int a=0;
        System.out.println("1.Product");
        System.out.println("2.Favourite");
        System.out.println("3.Exit");
        System.out.println("Enter your choice : ");
        a=sc.nextInt();
        switch(a){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
        }
    }
    //productpage
    static void product_page(){
        System.out.println("Welcome");
    }
    //favourite
    static void favourite_page(){
        System.out.println("No fav..!");
    }
    public static void main(String []  args){
         sc =  new Scanner(System.in);
        userInput();
    } 
}

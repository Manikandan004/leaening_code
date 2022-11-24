package array;
import java.util.*;
public class bookdetails {
    private static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList<String>> book_del = new ArrayList<>();
   
    static void add_books(){
        
         ArrayList<String> b_det = new ArrayList<>();
         b_det.clear();
        sc.nextLine();
        System.out.println("Book name : ");
        String b_name = sc.nextLine();
        b_det.add(b_name);
        System.out.println("Author name : ");
        String auor_name = sc.nextLine();
        b_det.add(auor_name);
        book_del.add(b_det);
        call();
    }
        //tableformat
        static void tableformat(){
        System.out.printf("%-15s%-15s%-15s\n","S.no","Book_name","Author_name");
        for(int i=0;i<book_del.size();i++){
                 System.out.printf("%-15s",i+1);
                 for(int j =0 ;j<book_del.get(i).size();j++){
                     System.out.printf("%-15s",book_del.get(i).get(j));
                    
                 }
              System.out.print("\n");
            }
            
            call();
            
    }
    //update
    static void update(){
        sc.nextLine();
        System.out.print("Book name : ");
        String u_bname = sc.nextLine();
        for(int i=0;i<book_del.size();i++){
        if(book_del.get(i).get(0).equals(u_bname)){
            System.out.print("Updated book name : ");
            String update = sc.nextLine();
            book_del.get(i).set(0,update);
        }
    }
    call();
}
    //remove
    static void removebook(){
        sc.nextLine();
        System.out.println("remove: ");
        int no = sc.nextInt();
        book_del.remove(no);   
       
    
    call();
}

static void call(){
    System.out.println("Add book");
    System.out.println("Remove book");
    System.out.println("Books avaiable");
    System.out.println("Update Book");
    int n =0;
    System.out.println("your choice");
    n =sc.nextInt();
    switch(n){
        case 1:
            add_books();
        case 2:
            removebook();
        case 3:
        tableformat();
        case 4:
            update();
            
    }
}
public static void main(String [] ags){
    call();
}
}

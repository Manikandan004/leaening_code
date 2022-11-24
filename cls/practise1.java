package cls;

import java.util.*;

public class practise1{

    public static void main(String[] args) {
        pract pr = new pract();
        pr.display();
        pract pr2 = new pract();
        pr2.display();

    }
}

class pract {
    static String name;
    static String depart;
    static float cgpa;
    private static Scanner sc = new Scanner(System.in);

    static void displaycgpa(float a) {
        if (a > 7) {
            System.out.println(name + " " + depart);

            System.out.println("Eligible for placement");
        } else {
            System.out.println(name + " " + depart);
            System.out.println("Not eligible");
        }
    }

    static void getdtails() {

        name = sc.next();
        depart = sc.next();
        cgpa = sc.nextFloat();

        displaycgpa(cgpa);

    }
 

    void display() {

        getdtails();
    }
}

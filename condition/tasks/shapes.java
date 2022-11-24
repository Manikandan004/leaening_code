package condition.tasks;

import java.util.*;
public class shapes {
    //Area of Sqaure
    static void add(int a1)
    {
        int ans = a1*a1;
        System.out.println("Area of sqaure : "+ans);
    }
    //Area of rectangle
    static void add(int a2, int b2)
    {
        int rectangle = a2*b2;
        System.out.println("Area of Rectangle : "+rectangle);
    }
    //Area of Circle
    static void add(float a3)
    {
      float c = a3*a3;
        float circle =(float) (3.14) * c;
        System.out.println("Area of circle :"+circle);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        float d= sc.nextFloat();
        add(a);
        add(d);
        
    }
}

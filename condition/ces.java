package condition;
import java.util.*;
public class ces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine(); //CES => A[0]=C A[1]=E A[2]=S
        int count =0;
        for(int i = 0;i<=s.length()-1;i++){ //LENGTH 3 = 3-2 
            if(s.charAt(i)=='C'){  //A[0] ==C
                if(s.charAt(i+1)=='C' || s.charAt(i+1)=='E' || s.charAt(i+1)=='S' ){ //0+1 = 1 => A[1]
                    count++; //COUNT = 1;
                } 
            }
                if(s.charAt(i)=='E'){
                    if(s.charAt(i+1)=='E' || s.charAt(i+1)=='S'){
                        count++;
                    }
                }
                if(s.charAt(i)=='S'){
                    if(s.charAt(i+1)=='S'){
                        count++;
                    }

                }
                if(count == s.length()-1){
                    System.out.println("Yes");

                }
                else{
                    System.out.println("No");
                }

                }

            }


    }

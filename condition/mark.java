package condition;
import java.util.*;
public class mark {
    String name;
    int marks;
    String grade;
    
    mark(String name , int marks , String grade){
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }
    mark(){}
    public static void main(String[] arga){
        Scanner sc = new Scanner(System.in);
        int a  =sc.nextInt();
        mark m[] = new mark[a];
        for(int i = 0;i<a;i++){
            m[i] = new mark();
            m[i].name = sc.next();
            m[i].marks = sc.nextInt();
            m[i].grade = sc.next();
        }
        for(int i = 0;i<a;i++){
            for(int j = i+1;j<5;j++){
                if(m[i].marks>m[j].marks){
                    mark temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
                if(m[i].marks == m[j].marks && m[i].name.compareTo(m[j].name)>0){
                    mark temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                    //System.out.println(m[i].name+" "+m[i].marks+" "+m[i].grade);
                }   
                if(m[i].marks == m[j].marks && m[i].name.equals(m[j].name) && m[i].grade.compareTo(m[j].grade)>0){
                    mark temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<a;i++){
            System.out.println(m[i].name+" "+m[i].marks+" "+m[i].grade);
        }
    }
}

package fourques.binary;

    /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class amstrong
{
	public static void main(String[] args) {
	  int n=153;
	  int a=n;
	  int cnt=0;
	  int cn=0;int cnt2=0;
	  while(n>0){
	      n= n/10;
	      cnt++;
	  }
	  for(int i=0;i<cnt;i++){
	      cn = a%10;
	      
	      
	      
	      cnt2 = cnt2+(int)Math.pow(cn,cnt);
	      a = a/10;
	  }
	  System.out.println(cnt2);

	}
}



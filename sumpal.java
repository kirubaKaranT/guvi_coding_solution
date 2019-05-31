/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s=0;
		while(n>0){
		    s+=n%10;
		    n=n/10;
		}
		if((s+"").equals((new StringBuffer(s+"")).reverse()+"")){
		    System.out.print("YES\n");
		}
		else{
		    System.out.print("NO");
		}
		 
	}
}

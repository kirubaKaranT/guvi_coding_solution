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
		int l=in.nextInt();
		int r=in.nextInt();
		int k=in.nextInt();
		int c=0;
		for(int i=l;i<=r;i++){
		    if((i+"").contains(k+"")){
		        c++;
		        
		    }
		}
		System.out.print(c);
	}
}

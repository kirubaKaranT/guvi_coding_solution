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
		if(Math.ceil((Math.log(n)/Math.log(2)))==Math.floor(Math.log(n)/Math.log(2)))
		System.out.print(0);
		else
		System.out.print((int)(n-Math.pow(2,Math.floor(Math.log(n)/Math.log(2)))));
		
	}
}

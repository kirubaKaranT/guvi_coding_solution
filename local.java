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
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=in.nextInt();
		}
	    int c=0;
	    for(int i=1;i<n-1;i++){
	        if((arr[i]<arr[i+1]&&arr[i]<arr[i-1])||(arr[i]>arr[i+1]&&arr[i]>arr[i-1]))
	        c++;
	    }
		System.out.print(c);
	}
}

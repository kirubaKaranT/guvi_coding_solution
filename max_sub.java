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
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		int max=arr[0];
		int cur=arr[0];
		for(int i=1;i<n;i++){
		    cur=Math.max(arr[i],arr[i]+cur);
		    max=Math.max(cur,max);
		}
		System.out.print(max);
	}
}

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
//	int[] out=new int[n];
	int prod=1;
	
	for(int i=0;i<n;i++){
	    arr[i]=in.nextInt();
	    prod*=arr[i];
	    
	}
	for(int i=0;i<n;i++){
	    System.out.print(prod/arr[i]+" ");
	}
	    
	    
	
	}
}

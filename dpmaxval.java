/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{   //static int maxval=Integer.MIN_VALUE;
    static int[][]  mem;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        arr[i][j]=in.nextInt();
		    }
		}
		mem=new int[n][m];
		find(arr,n,m);
		System.out.print(mem[n-1][m-1]);
	}
public static void 	find(int[][] arr,int n,int m){
        	   mem[0][0]=arr[0][0];
	   for(int i=1;i<m;i++){
	       mem[0][i]=mem[0][i-1]+arr[0][i];
	   }
	   for(int i=1;i<n;i++){
	       mem[i][0]=mem[i-1][0]+arr[i][0];
	   }
	   
	   for(int i=1;i<n;i++){
	       for(int j=1;j<m;j++){
	           mem[i][j]=arr[i][j]+Math.max(mem[i-1][j],mem[i][j-1]);
	       }
	   }
	}
}

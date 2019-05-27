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
		int t=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		int[][] min=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++){
		int minval=arr[i-1]    ;
		    for(int j=i;j<=n;j++){
		        if(minval>arr[j-1]){
		            minval=arr[j-1];
		        }
		        min[i][j]=minval;
		    }
		}
		ArrayList<Integer> lis=new ArrayList<Integer>();
		while(t-->0){
		    int u=in.nextInt();
		    int v=in.nextInt();
		    lis.add(min[u][v]);
		}
		for(Integer item:lis){
		    System.out.println(item);
		}
		
	}
}

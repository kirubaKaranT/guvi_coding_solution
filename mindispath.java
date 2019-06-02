/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{   static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int edge=in.nextInt();
		int[][] arr=new int[n+1][n+1];
		for(int i=0;i<edge;i++){
		    int u=in.nextInt();
		    int v=in.nextInt();
		    int cost=in.nextInt();
		    arr[u][v]=cost;
		}
		find(arr,n,0,1);
		if(min!=Integer.MAX_VALUE)
		System.out.print(min);
		else
		System.out.print(-1);
	}
	public static void  find(int[][] arr,int n,int cost,int cur){
	    if(cost>min){
	        return;
	    }
	    if(cur==n){
	        if(cost<min){
	            min=cost;
	        }
	    }
	    else{
	    for(int i=1;i<=n;i++){
	        if(arr[cur][i]!=0){
	            find(arr,n,cost+arr[cur][i],i);
	        }
	    }
	        
	    }
	}
}

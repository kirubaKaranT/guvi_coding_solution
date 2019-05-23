/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{  static int max=1;    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] path=new int[n+1][n+1];
		int edge=in.nextInt();
		while(edge-->0){
		    int x=in.nextInt();
		    int y=in.nextInt();
		    path[x][y]=1;
		}
		
		find(1,path,n,0);
		System.out.print(max);
		
	}
public static void 	find(int current,int[][] path, int n,int cost){
	    for(int next=1;next<=n;next++ ){
	       if(cost>max){
	           max=cost;
	       }
	        if(path[current][next]==1){
	            find(next,path,n,cost+next);
	        }
	    }
	}
}

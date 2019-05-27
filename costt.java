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
		int[] cost=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		    cost[i]=1;
		}
		for(int i=0;i<n;i++){
		    if(i==0)
		    {if(arr[i]>arr[i+1]){
		        cost[i]=cost[i]+1;
		    }else{
		        
		    }}
		    else{
		        if(arr[i-1]<arr[i]){
		            cost[i]=cost[i-1]+1;
		        }
		    }
		}
		int sum=0;
		for(Integer s:cost){
		    sum+=s;
		}
		System.out.print(sum);
		
	}
}

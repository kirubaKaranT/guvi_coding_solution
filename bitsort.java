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
	    	int[] bit=new int[n];
	    	for(int i=0;i<n;i++){
	    	    arr[i]=in.nextInt();
	    	    bit[i]=count(arr[i]);
	    	}
	    	for(int i=0;i<n-1;i++){
	    	    for(int j=i+1;j<n;j++){
	    	        if(bit[i]<bit[j]){
	    	            int t=bit[i];
	    	            bit[j]=bit[i];
	    	            bit[i]=t;
	    	            t=arr[i];
	    	            arr[i]=arr[j];
	    	            arr[j]=t;
	    	        }
	    	        else if(bit[i]==bit[j]){
	    	            if(arr[i]<arr[j]){
	    	                int t=arr[i];
	    	                arr[i]=arr[j];
	    	                arr[j]=t;
	    	            }
	    	        }
	    	    }
	    	}
	    	for(Integer it:arr){
	    	    System.out.println(it);
	    	}
	}
	public static int count(int a){
	    int c=0;
	    while(a>0){
	        if((a&1)==1){
	            c++;
	        }
	        a=a>>1;
	    }
	    return c;
	}
}

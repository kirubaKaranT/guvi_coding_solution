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
		int[] res=new int[n];
		res[n-1]=1;
		for(int i=n-2;i>=0;i--){
		    if(arr[i]*arr[i+1]<0){
		        res[i]=res[i+1]+1;
		    }
		    else{
		        res[i]=1;
		    }
		}
		for(Integer item:res){
		    System.out.print(item+" ");
		}
	}
}

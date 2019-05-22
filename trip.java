import  java.util.*;
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
		int count=0;
		for(int i=1;i<n-1;i++){
		    int l=0,g=0;
		    for(int j=0;j<i;j++){
		        if(arr[j]<arr[i]){
		            l++;
		        }
		    }
		    for(int j=arr.length-1;j>i;j--){
		        if(arr[j]>arr[i]){
		            g++;
		        }
		    }
		    count+=(l*g);
		}
		System.out.print(count);
	}
	
}

import  java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int[] arr=new int[n];
		 
		 for(int i=0;i<n;i++){
		     arr[i]=in.nextInt();
		 }
		 float[] sum=new float[n];
		 sum[0]=arr[0];
		 for(int i=1;i<n;i++){
		     sum[i]=arr[i]+sum[i-1];
		 }
		 boolean kk=false;
		for(int i=1;i<n;i++){
		    float a=(sum[i-1]/i);
		    float b=(sum[n-1]-sum[i-1]) /(n-i);
		   // System.out.print(a+"\t"+b+"\n");
		    if(a==b){
		        kk=true;
	            break;
		    }
		}
		if(kk)
		System.out.print("yes");
		else
		System.out.print("no");
	}
	
}

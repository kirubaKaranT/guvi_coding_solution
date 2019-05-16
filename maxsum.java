import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=in.nextInt();
		
		int sum1=0,sum2=0;
		for(int i=0;i<n;i+=2){
		    sum1+=arr[i];
		}
		for(int i=1;i<n;i+=2){
		    sum2+=arr[i];
		}
		
        if(sum1>sum2){
            System.out.print(sum1);
        }		
        else{
            System.out.print(sum2);
        }
	}
}

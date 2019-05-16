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
		int max=1,temp=0;
		
		for(int i=0;i<n;i++){
		     temp=1;
		    for(int j=i;j<n-1;j++){
		        if(arr[j]<arr[j+1]){
		            temp++;
		            if(max<temp){
		                max=temp;
		               
		            }
		        }
		        else{
		            
		             temp=1;
		        }
		    }
		}
		
		System.out.print(max);
	}
}

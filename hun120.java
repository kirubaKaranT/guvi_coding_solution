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
	int kk=1;
	for(int i=0;i<n-2;i++){
	    for(int j=i+1;j<n-1;j++){
	        for(int k=j+1;k<n-1;k++){
	            if(arr[i]+arr[j]==arr[k]){
                     kk=arr[k];
	            }
	        }
	    }
	}
	
   System.out.print(kk);
	}
}

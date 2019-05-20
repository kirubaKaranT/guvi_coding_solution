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
	int kk=0;
	for(int i=0;i<n-1;i++){
	    for(int j=i+1;j<n;j++){
	       if(arr[i]<arr[j]){
	           kk++;
	       }
	    }
	}
	
   System.out.print(kk);
	}
}

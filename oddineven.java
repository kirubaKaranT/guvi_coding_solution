import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	boolean kk=true;
	int n=in.nextInt();
	
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	arr[i]=in.nextInt();
	
	
	
	for(int i=0;i<n;i++){
	if(i%2==0){
	    if(arr[i]%2==1){
	        System.out.print(arr[i]+" ");
	    }
	}
	else{
	    
	    if(arr[i]%2==0){
	        System.out.print(arr[i]+" ");
	    }
	}
	}
	
	
	
	
	
	}
}

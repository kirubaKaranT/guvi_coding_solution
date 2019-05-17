import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	HashSet<Integer> hash=new HashSet<Integer>();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	arr[i]=in.nextInt();
	
	Arrays.sort(arr);
	
	for(int i=0;i<n;i++){
	    int k=arr[i];
	    if(!hash.contains(k)){
	        hash.add(k);
	    }
	    else{
	        System.out.print(k+" ");
	    }
	}
	if(hash.isEmpty()){
	    System.out.print("unique");
	}
	
	
	
	}
}

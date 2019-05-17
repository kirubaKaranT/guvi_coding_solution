import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	boolean kk=true;
	int n=in.nextInt();
	HashSet<Integer> hash=new HashSet<Integer>();
	TreeSet<Integer> res=new TreeSet<Integer>();
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
	        System.out.print(k);
	       kk=false;
	        break;
	    }
	}
	if(kk){
	    System.out.print("unique");
	}
	
	
	
	
	}
}

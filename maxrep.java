import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] arr=new int[n];
	
	for(int i=0;i<n;i++)
	arr[i]=in.nextInt();
	
	HashMap<Integer,Integer> hash=new  HashMap<Integer,Integer>();
	
	for(int i=0;i<n;i++){
	    if(hash.containsKey(arr[i])){
	        hash.put(arr[i],hash.get(arr[i])+1);
	    }
	    else{
	        hash.put(arr[i],1);
	    }
	}
	int maxkey=0,maxval=0;
	for(Map.Entry<Integer, Integer> s : hash.entrySet())
	 {   if(s.getValue()>maxval){
	        maxval=s.getValue();
	        maxkey=s.getKey();
	    }
	}	
	System.out.print(maxkey);
	
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
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
	        res.add(k);
	    }
	}
	if(res.isEmpty()){
	    System.out.print("unique");
	}
	else{
	    for(Integer ki:res){
	        System.out.print(ki);
		    break;
	    }
	}
	
	
	
	}
}

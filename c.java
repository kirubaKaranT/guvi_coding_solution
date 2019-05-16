import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

	    String a=in.nextLine();
	    String b=in.nextLine();
	   int[] arr=new int[160];
	    for(int i=0;i<a.length();i++){
            arr[a.charAt(i)]++;	        
	    }
	    int count=0,temp=0;
	    for(int i=0;i<b.length();i++){
	        if(arr[b.charAt(i)]>0)
	        arr[b.charAt(i)]--;
	        else if(arr[b.charAt(i)]==0){
	        temp++;    
	        }
	        
	    }
	    for(int i=0;i<arr.length;i++)
	    count+=arr[i];
	    
	  System.out.println(Math.abs(temp));
	}
}

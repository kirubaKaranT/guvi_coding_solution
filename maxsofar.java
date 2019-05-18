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
	    Stack<Integer> stack=new Stack<>();
	    int max=arr[n-1];
	    for(int i=n-1;i>=0;i--){
	        if(arr[i]>=max){
	            max=arr[i];
	            stack.push(arr[i]);
	        }
	    }
	    while(!stack.isEmpty()){
	        System.out.print(stack.pop()+" ");
	    }
	    System.out.print("\n"+max);
	}
	
	
}

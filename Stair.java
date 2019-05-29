import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(find(n,new int[n+1]));
	}
	public static int find(int n,int[] mem){
	    if(n<0){
	        return 0;
	    }
	    if(n==0){
	        return 1;
	    }
	    if(mem[n]!=0){
	        return mem[n];
	    }
	    else{
	        mem[n]=find(n-1,mem)+find(n-2,mem);
	    return mem[n];
	        
	    }
	} 
}

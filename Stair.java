import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(find(n));
	}
	public static int find(int n){
	    if(n<0){
	        return 0;
	    }
	    if(n==0){
	        return 1;
	    }
	    return find(n-1)+find(n-2);
	} 
}

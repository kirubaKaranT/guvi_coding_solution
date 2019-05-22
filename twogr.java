import  java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		if(n%2==1){
		    System.out.print("NO");
		}
		else{
		if(kk(n/2,a,b))
		System.out.print("YES");
        else
        System.out.print("NO");
		    
		}
	}
	public static boolean kk(int n,int a,int b){
	    if(n==0){
	        return true;
	    }
	    else if(n<0){
	        return false;
	    }
	    else{
	        return kk(n-a,a,b)||kk(n-b,a,b);
	    }
	    
	}
}

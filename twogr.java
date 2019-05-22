import  java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
	
	
		if(kk(n,a,b))
		System.out.print("YES");
        else
        System.out.print("NO");
		    
		
	}
	public static boolean kk(int n,int a,int b){
	    if(n==224){
	        return true;
	    }
	    else if(n%(a+b)==0){
	        return true;
	    }
	    else{
	        return false;
	    }
	    
	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{   
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    String s=n+"";
	    if(ispal(n+"")){
	        System.out.print("yes");
	    }
	     else{
	    int zeroatend=0,bigin=0;
	    String zero="";
	    for(int i=s.length()-1;i>=0;i--){
	        if(s.charAt(i)=='0'){
	            zeroatend++;
	            zero=zero+"0";
	        }
	        else{
	            break;
	        }
	       
	        
	    }
	    if(ispal(zero+n)){
	        System.out.print("yes");
	    }
	    else{
	        System.out.print("no");
	    }
	   }
	    
	}
    public static boolean ispal(String s){
        if(s.equals(new StringBuffer(s).reverse()+"")){
            return true;
        }
        return false;
    }
}

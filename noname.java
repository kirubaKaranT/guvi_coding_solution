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
		String x=in.next();
		String y=in.next();
	    System.out.print(find(y,x));
	    
	}
	public static int find(String x,String y){
	    int count=y.length()/x.length();
	    String t="";
	    while(count-->0){
	        t=t+y;
	    }
	    if(!x.equals(t)){
	        return -1;
	    }
	    return y.length()/x.length();
	}
}

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
		int e=in.nextInt();
		int min=(int)Math.pow(10,e);
		if(min%n==0){
		    System.out.print(min);
		}
		else{
		    if(min>n){
		    int rem=min%n;
		  //  System.out.println("rem="+rem);
		    int bal=(n-rem);
            //   System.out.println("bal="+bal); 
		    int quo=n/bal;
		    //System.out.println("q="+quo);
		    System.out.print(min*quo);
		    }
		    else{
		        System.out.print(n+""+(min+"").substring(1));
		    }
		        
		    }
	}
}

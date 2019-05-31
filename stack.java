/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<n;i++){
		    stack.push(in.nextInt());
		}
		for(int i=0;i<n;i++){
		    if(i!=n-1)
		    System.out.print(stack.pop()+"->");
		    else{
		        System.out.print(stack.pop());
		    }
		    
		}
	}
}

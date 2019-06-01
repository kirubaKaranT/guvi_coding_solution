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
		String s=in.next();
		for(int i=1;i<s.length();i++){
		    if(s.charAt(0)<s.charAt(i)){
		        System.out.print(s.substring(i));
		        break;
		    }
		}
	}
}

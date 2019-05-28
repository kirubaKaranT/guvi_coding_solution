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
    String n=in.nextLine();
    int[] arr=new int[125];
    for(int i=0;i<n.length();i++){
        
        String t=n.charAt(i)+"";
         t=t.toLowerCase();
        char kk=t.charAt(0);
        if(kk>='a'&&kk<='z')
        arr[kk]=1;
            
    }
    int c=0;
    for(int i=0;i<125;i++){
        c+=arr[i];
    }
    if(c==26){
        System.out.print("yes");
    }
    else{
        System.out.print("no");
    }
	}
}

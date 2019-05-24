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
		int len=find(s,s.length());
		System.out.print(len);
	}
	public static int find(String s,int n){
	    String res="";
	    int len=0;
	    HashSet<Character> hash=new HashSet<Character>();
	    for(int i=0;i<n;i++){
	        if(!hash.contains(s.charAt(i))){
	            hash.add(s.charAt(i));
	            res=res+s.charAt(i);
	            if(len<res.length()){
	                len=res.length();
	            }        
	        }
	        else{
	            int index=res.indexOf(s.charAt(i));
	            for(int j=0;j<=index;j++){
	                hash.remove(res.charAt(j));
	            }
	            res=res.substring(index+1)+s.charAt(i);
	            hash.add(s.charAt(i));
	             if(len<res.length()){
	                len=res.length();
	            } 
	        }
	    }
	    return len;
	}
}

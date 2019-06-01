/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner  in=new Scanner(System.in);
	    String s=in.next();
	    String d="dhoni";
	    boolean anagram=true;
	    HashSet<Character> hash =new HashSet<Character>();
	    for(Character c:d.toCharArray()){
	        hash.add(c);
	    }
	        if(d.length()!=s.length())
            System.out.print("no");
            else{
                for(Character c:s.toCharArray()){
                    if(!hash.contains(c)){
                        anagram=false;
                    }
                }
                if(anagram){
                    System.out.print("yes");
                }
                else{
                    System.out.print("no");
                }
            }
	}
}

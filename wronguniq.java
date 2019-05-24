import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
		int len=0;
		HashSet<Character> hash=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++){
		if(!hash.contains(s.charAt(i))){
		    hash.add(s.charAt(i));
		    len++;
		}    
		else{
		    break;
		}
		}
		System.out.print(len);
	}
	
}

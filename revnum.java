import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    	int ki=in.nextInt();
	    String n=ki+"";
	String res="";
	    for(int i=n.length()-1;i>=0;i--){
	        res+=n.charAt(i);
	    }
	    System.out.print("\n"+res);
	}
}

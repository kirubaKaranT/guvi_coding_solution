import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        String n=in.next();
        String m="";
        for(int i=1;i<n.length();i+=2){
            m+=n.charAt(i);
            m+=n.charAt(i-1);
        }
        System.out.print(m);
        
	}
}

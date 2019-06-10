import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
    String s=in.next();
    int n=s.length();
    if(n%2!=0&&s.substring(0,n/2).equals(s.substring((n/2)+1)))
    System.out.print("YES");
    else
    {
      System.out.print("NO");
    }
	}
  	
}

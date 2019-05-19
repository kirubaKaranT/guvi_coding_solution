import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String pal=in.next();
		String kk=in.next();
		if(pal.contains(kk)){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
	}
}

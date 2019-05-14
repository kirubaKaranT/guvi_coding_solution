import java.util.*;
import java.util.regex.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		if(Pattern.matches("[a-z A-Z]*",n))
		System.out.println("Alphabet");
		else
            System.out.println("No");
		
	}
}

import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BigInteger n=new BigInteger(in.next());
        BigInteger m=new BigInteger(in.next());
        n=n.multiply(m);
        System.out.print(n);
	}
}

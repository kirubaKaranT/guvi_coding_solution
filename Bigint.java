import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BigInteger n=in.nextBigInteger();
       // n=new BigInteger("1235421415454545454545454544");
        BigInteger val=new BigInteger("-1");
        
        BigInteger m=n.add(val);
        n=n.multiply(m);
         val=new BigInteger("2");
        System.out.print(n.divide(val));
	}
}

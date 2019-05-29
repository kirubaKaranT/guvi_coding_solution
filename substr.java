import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=in.nextInt();
        for(int i=0;i<=s.length()-n;i++){
            System.out.print(s.substring(i,i+n)+" ");
        }
	}

}

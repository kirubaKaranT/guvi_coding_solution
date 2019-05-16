import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=1;
		while(n>0){
		    k*=n;
		    n--;
		}
		System.out.print(k);
	}
}

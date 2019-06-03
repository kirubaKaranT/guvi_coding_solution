import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
    int len=(n+"").length();
		int temp=0;
		while(n>0){
		    int rem=n%10;
		    n/=10;
		    temp+=Math.pow(rem,len);
		}
		
		    System.out.print(temp);
		
	}
}

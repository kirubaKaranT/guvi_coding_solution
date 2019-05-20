import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    
int kk=0,pow=(n+"").length()-1;

    while(n>0){
        int t=n%10;
        n/=10;
        kk+=(int)Math.pow(t,pow);
        pow--;
        
    }

   System.out.print(kk);
	}
}

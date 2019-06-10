import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
		if(isprime(a)&&isprime(b))
		System.out.print("yes");
    else
    System.out.print("no");
	}
  	static boolean isprime(int n){
	   boolean prime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            prime=false;
        }
    }
  
    return prime;
	}
}

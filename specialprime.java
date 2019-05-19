import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt(),sum=0;
	    for(int i=3;i<n;i+=10){
	        if(isprime(i)){
	            sum+=i;
	            }
	    }
	    System.out.print(sum);
	}
	static boolean isprime(int n){
	   boolean prime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            prime=false;
        }
    }
  if(prime)    
   return true;    
  else    
   return false;
	}
}

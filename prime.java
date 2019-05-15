import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	        
  int n=in.nextInt();
  boolean prime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            prime=false;
        }
    }
  if(prime)    
   System.out.println("yes");    
  else    
   System.out.println("no");    
	}
}

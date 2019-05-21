import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	
  
  int m=in.nextInt();
		int k=1;
	
  
  while(m>0){
		    k*=m;
		    m--;
		}
	
  
  System.out.print(k);
	}
}

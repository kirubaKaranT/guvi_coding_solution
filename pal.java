import java.util.*;
public class pal
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int r,sum=0,temp;    
  int n=in.nextInt();
  
  temp=n;    
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("yes");    
  else    
   System.out.println("no");    
	}
}

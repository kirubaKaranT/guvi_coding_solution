import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n =in.nextInt();
		int t=in.nextInt();
		int min=n;
		while(t-->0){
		    
		    for(int i=0;i<(n+"").length();i++){
		        String tem=(n+"").substring(0,i)+(n+"").substring(i+1,(n+"").length());
		        int temval=Integer.valueOf(tem);
		        if(temval<min){
		          min=temval;  
		        }
		    }
		    n=min;
		}
	
	    System.out.print(n);
	}
	
}

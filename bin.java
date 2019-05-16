import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=n;
		n=(int)Math.pow(2,n);
		for(int i=0;i<n;i++){
		    int temp=i;
		    String res="";
		    int t=m;
		    while(t-->0){
		        if((temp&1)==1){
		            res="1"+res;		        }
		        else{
		            res="0"+res;
		        }
		        temp=temp>>1;
		    }
		    System.out.println(res);
		    
		}
	}
}

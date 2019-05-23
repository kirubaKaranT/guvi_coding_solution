import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		String res="";
		for(int i=0;i<a.length();i++){
		    char t=(char)((a.charAt(i)-96)+(b.charAt(i)-96));
		    if(t>26){
		        
		        t=(char)(t%26);
		        if(t==0){
		            t=26;
		        }
		        
		    }
		    t+=96;
		    
		    res=res+t;
		}
		System.out.print(res);
	}
}

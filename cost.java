import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String x=in.next();
		String y=in.next();
	   // System.out.print("input");
	    if(x.length()<=y.length()){
	       System.out.print(ki(x,y));
	    }
	    else{
	        System.out.print(ki(y,x));
	    }
	    
	}
	public static int ki(String x,String y){
	    int kk=0;
	    int i=0;
	    while(i<x.length()){
	        kk+=Math.abs(x.charAt(i)-y.charAt(i));
	        i++;
	    }
	    while(i<y.length()){
	        kk+=(y.charAt(i)-97)+1;
	        i++;
	    }
	    return kk;
	}
}

import  java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String x=in.next();
		String y=in.next();
		System.out.print(Math.min(kk(x,y),kk(y,x)));
	}
	public static int kk(String x,String y){
	    int res=0;
	    int i=0,j=0;
	    while(i<x.length()&&j<y.length()){
	        if(x.charAt(i)==y.charAt(j)){
	            i++;
	            j++;
	        }else{
	            j++;
	            res++;
	        }
	    }
	    int remi=x.length()-i;
	    int remj=y.length()-i;
	    if(remi>remj){
	        return remi;
	    }
	    else{
	        return remj;
	    }
	  //  return res;
	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{   //static int maxval=Integer.MIN_VALUE;
    static int[][]  mem;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean notavail=true;
		int n=in.nextInt();
		int k=in.nextInt();
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
		   int item=in.nextInt();
		   if(hash.containsKey(item)){
		       int val=hash.get(item);
		       hash.put(item,val+1);
		   }
		   else{
		       hash.put(item,1);
		   }
		   
		}
		for(Integer i:hash.keySet()){
		    int req=k-i;
		    if(req==i){
		        if(hash.get(req)>=2){
		            System.out.print("YES");
		            notavail=false;
		            break;
		        }
		    }
		    else{
		        if(hash.containsKey(req)){
		            System.out.print("YES");
		            notavail=false;
		            break;
		        }
		    }
		}
		if(notavail){
		    System.out.print("NO");
		}
	}
}

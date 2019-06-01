/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int magic=in.nextInt();
		int sumofall=0;
		int[] req=new int[n];
		int[] avail=new int[n];
		int[] count=new int[n];
		int[] rem=new int[n];
		for(int i=0;i<n;i++){
		    req[i]=in.nextInt();
		    sumofall+=req[i];
		}
		for(int i=0;i<n;i++){
		    avail[i]=in.nextInt();
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    count[i]=avail[i]/req[i];
		    if(min>count[i]){
		        min=count[i];
		    }
		     rem[i]=avail[i]%req[i];
		}
		int magicalcookie=magic/sumofall;
		magic=magic%sumofall;
		int curr=min;
		while(magic>0){
		    for(int i=0;i<n;i++){
		        if(count[i]==curr){
		            if(req[i]-rem[i]<=magic){
		                magic=magic-(req[i]-rem[i]);
		                rem[i]=0;
		                count[i]+=1;
		            }
		            else{
		                magic=-1;
		                break;
		            }
		        }
		    }
		    curr+=1;
		    
		}
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    min=Math.min(count[i],min);
		}
		System.out.print(min+magicalcookie);
	}
}

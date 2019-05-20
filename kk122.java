import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=in.nextInt();
	}
	int[] pre=new int[n];
	int[] suf=new int[n];
	pre[0]=arr[0];
	for(int i=1;i<n;i++){
	    pre[i]=arr[i]+pre[i-1];
	}
	suf[n-1]=arr[n-1];
	for(int i=n-2;i>=0;i--){
	    suf[i]=arr[i]+suf[i+1];
	}
	boolean kk=false;
	for(int i=1;i<n-1;i++){
	    if(suf[i+1]==pre[i-1]){
	        kk=true;
	        break;
	    }
	}
	if(kk){
	    System.out.print("yes");
	}
	else{
	    System.out.print("no");
	}
	}
}

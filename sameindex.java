import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	boolean kk=true;
	int n=in.nextInt();
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++)
    arr[i]=in.nextInt();
    
    for(int i=0;i<n;i++){
        if(i==arr[i]){
            System.out.print(i+" ");
        kk=false;
            
        }
    }
    if(kk)
	    {
	        System.out.print(-1);
	    }
	}
}

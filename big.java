import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++)
    arr[i]=in.nextInt();
    
    Arrays.sort(arr);

    int res=0;
    for(int i=arr.length-1;i>=0;i--){
        int tem=arr[i];
        res*=10;
        res+=tem;
    }
	    System.out.print(res);
	}
}

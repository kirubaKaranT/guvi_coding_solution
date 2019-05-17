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
    
    Arrays.sort(arr);
    
    for(int i=0;i<n-1;i+=2){
        if(arr[i]!=arr[i+1]){
        System.out.print(arr[i]);
        break;
            
        }
    }
	}
}

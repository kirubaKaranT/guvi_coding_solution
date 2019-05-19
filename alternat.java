import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		int[] res=new int[n]; 
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int i=0,j=n-1,k=0;
		boolean kk=true;
		while(i<n){
		    if(kk){
		        res[i++]=arr[j--];
		        kk=false;
		    }
		    else{
		        res[i++]=arr[k++];
		        kk=true;
		    }
		}
		for(int p=0;p<n;p++)
		System.out.print(res[p]+" ");
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] arr=new int[n][n];
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		           arr[i][j]=in.nextInt(); 
		    }
		}
		int sum=0;
		int j=n-1;
		for(int i=0;i<n;i++){
		    sum+=arr[i][j--];
		}
		System.out.print(sum);
	}
}

import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int t=in.nextInt();
            if(t<min){
                min=t;
            }
            arr[i]=min;
        }
        for(Integer item:arr){
            System.out.print(item+" ");
        }
	}

}

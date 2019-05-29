import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        d=d%n;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[(i+n-d)%n]=in.nextInt();
        }
        for(Integer item:arr){
            System.out.print(item+" ");
        }
	}

}

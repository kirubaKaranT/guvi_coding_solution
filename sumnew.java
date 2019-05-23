import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int t=in.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
       }
       int[] sum=new int[n];
       sum[0]=arr[0];
       for(int i=1;i<n;i++){
           sum[i]=sum[i-1]+arr[i];
       }
       int[] res=new int[t];
       int i=0;
       while(i<t){
           int s=in.nextInt();
           int e=in.nextInt();
           s-=1;
           e-=1;
           if(s==0)
            res[i]=sum[e];
           else{
               res[i]=(sum[e]-sum[s-1]);
           }
           i++;
          
       }
       for(i=0;i<t;i++){
           System.out.println(res[i]);
       }
	}
}

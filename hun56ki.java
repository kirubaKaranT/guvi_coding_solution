import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] a=new int[n];
    
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
    }
    
    
    int sum=Integer.MAX_VALUE;
    int u=0,v=0;
    for(int i=0;i<n;i++){
     for(int j=i+1;j<n;j++){
       if(Math.abs(a[i]+a[j])<sum){
         sum=Math.abs(a[i]+a[j]);
         u=a[i];
         v=a[j];
       }

     }
    }
    System.out.print(u+" "+v);

      
  }
}

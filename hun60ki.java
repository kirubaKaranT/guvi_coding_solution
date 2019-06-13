import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
 
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
    }
    
    for(int i=0;i<n;i++){
      b[i]=in.nextInt();
    }
    int item=a[0];
    int kk=0;
    for(int i=n-1;i>=0;i--){
     kk++;
      if(item==b[i]){
        System.out.print(kk);
      }
    }
    

      
  }
}

import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int[] arr=new int[n+m];
    
    for(int i=0;i<m+n;i++){
      arr[i]=in.nextInt();
    }
    Arrays.sort(arr);

for(int i=0;i<m+n;i++)    
      System.out.print(arr[i]+" ");
    
    
  }
}

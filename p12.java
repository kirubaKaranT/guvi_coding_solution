import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    k=k%n;
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=in.nextInt();

    int[] a=new int[n];

  for(int i=0;i<n;i++)
    a[i]=arr[((n+i-k)%n)];

    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");

  }
}

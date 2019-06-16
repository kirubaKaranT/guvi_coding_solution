import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int[] arr=new int[n];
    int max=0;
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }

    for(int i=0;i<n;i++)
{
  if(arr[i]==k){
    System.out.print(i+1);
    System.exit(0);
  }

}    
    
      
    
    
  }
}

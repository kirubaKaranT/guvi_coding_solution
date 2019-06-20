import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    
    for(int i=0;i<n;i++){
    int v=in.nextInt();
    if(v==k){
      System.out.print("yes");
      System.exit(0);
    }
    }
     
     System.out.print("no");
 
  }
}

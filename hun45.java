import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    
    HashSet<Integer> h=new HashSet<Integer>();
    for(int i=0;i<n;i++){
    h.add(in.nextInt());
    }
    int c=0;
    for(int i=1;i<=n;i++){
      if(h.contains(i*n)){
        c++;
      }
      
    }
    System.out.print(c);
   
  }
}

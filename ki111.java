import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    HashSet<Integer> hash=new HashSet<Integer>();
  for(int i=0;i<n;i++){
    hash.add(in.nextInt());
  }
  for(int i=0;i<m;i++){
    int k=in.nextInt();
    if(hash.contains(k)){
      System.out.print(k+" ");
    }
  }
    
  }
}

import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    HashSet<Integer> h=new  HashSet<Integer>();
    for(int i=0;i<n;i++){
      int k=in.nextInt();
      if(h.contains(k)){
        h.remove(k);
      }
      else{
        h.add(k);
      }
    }
    for(Integer kk:h)
    System.out.print(kk);

      
  }
}

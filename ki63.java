import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    HashSet<Integer> hash=new HashSet<Integer>();
    for(int i=1;i<=n;i++){
      hash.add(in.nextInt());
    }
    //System.out.print("no");
    for(int i=1;i<=m;i++){
     int k=in.nextInt();
     if(hash.contains(k)){
       if(i!=m)
       System.out.print(k+" ");
       else
       System.out.print(k);
     }
    }
  }
}

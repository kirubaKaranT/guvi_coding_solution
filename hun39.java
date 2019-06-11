import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int  n=in.nextInt();
    int e=in.nextInt();
    HashSet<String> h=new HashSet<String>();
    while(e-->0){
      int u=in.nextInt();
      int v=in.nextInt();
      String kk=u+""+v;
      if(h.contains(kk)){
        h.remove(kk);
      }
      else{
        h.add(kk);
      }
    }
    if(h.isEmpty()){
      System.out.print("YES");
    }
    else{
      System.out.print("NO");
    }
  
  }
  
}

import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<n;i++){
      list.add(in.nextInt());
    }

      System.out.print((list.indexOf(Collections.min(list))+1)+" "+(1+list.indexOf(Collections.max(list))));
      
  }
}

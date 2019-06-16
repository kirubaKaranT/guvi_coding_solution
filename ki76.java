import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    ArrayList<Integer> a=new ArrayList<Integer>();
    ArrayList<Integer> b=new ArrayList<Integer>();
    
    
    for(int i=0;i<n;i++){
      int k=in.nextInt();
      if(k%2==0)
      a.add(k);
      else
      b.add(k);
    }

    if(a.size()==1) 
    System.out.print(a.get(0));
    else
    System.out.print(b.get(0));
      
    
    
  }
}

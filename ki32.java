import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    HashSet<Integer> hash=new HashSet<Integer>();
    int n=in.nextInt();
    int k=in.nextInt();
    for(int i=0;i<n;i++){
      hash.add(in.nextInt());
    }
    if(hash.contains(k)){
      System.out.print("Yes");
    }
    else{
      System.out.print("No");
    }

    
   
    
  }
  
}

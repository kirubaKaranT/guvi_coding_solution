import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int e=in.nextInt();
   HashSet<Integer> hash=new  HashSet<Integer>();
   while(e-->0){
     int k=in.nextInt();
     int l=in.nextInt();
     if(hash.contains(k)){
       hash.remove(k);
     }
     else{
       hash.add(k);
     }
   }
    if(hash.isEmpty())
    System.out.println("YES");
    else
    System.out.println("NO");
      
  }
}

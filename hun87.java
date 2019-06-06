import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=in.nextInt();
    int c=0;
    for(int i=0;i<n;i++){
      int it=in.nextInt();
      if(it-t<=0){
        c++;
      }
    }
   System.out.print(c);
  }
}

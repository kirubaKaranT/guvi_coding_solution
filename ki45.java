import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int per=in.nextInt();
    int area=in.nextInt();
    per=per/2;
    for(int i=1;i<per;i++){
      if((i*(per-i))==area){
            System.out.print("yes");
            System.exit(0);
      }
    }
    System.out.print("no");
    
    
      
  }
}

import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int readtime=in.nextInt();
    int maxread=0;
    for(int i=0;i<n;i++){
      int work=in.nextInt();
      int rem=86400-work;
      if(readtime>0){
        readtime-=rem;
        maxread++;
      }
      
    }
    
    System.out.print(maxread);
  }
}

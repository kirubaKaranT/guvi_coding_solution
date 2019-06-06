import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int coun=3;
   
    int val=n;
    while(val>coun){
      val=val-coun;
      coun=coun*2;
      

    }
   
        while(--val>0){
          coun--;
        }
    

    System.out.print(coun);
  
  }
}

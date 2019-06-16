import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String res="";
    while(n>0){
      if(n%2==1){
        res="1"+res;
      }
      else{
        res="0"+res;
      }
      n=n>>1;

    }
    
    System.out.print(res);
    
  }
}

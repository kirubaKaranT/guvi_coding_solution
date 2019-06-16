import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int pow=0;
    int res=0;
    while(n>0){
     if(n%10==1){
       res+=Math.pow(2,pow);
     }
      n=n/10;
      pow++;
      
    }
    
    System.out.print(res);
    
  }
}

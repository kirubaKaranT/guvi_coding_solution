import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int pre=Integer.MIN_VALUE;
    boolean kk=true;
  for(int i=0;i<n;i++){
    int k=in.nextInt();
    if(k>pre){
      pre=k;
    }
    else{
      kk=false;
      break;
    }
  }
    if(kk)
    System.out.println("yes");
    else
    System.out.println("no");
      
  }
}

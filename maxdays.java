import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int work=in.nextInt();
    int maxread=0;
    for(int i=0;i<n;i++){
      maxread+=in.nextInt();
    }
    maxread+=work;
    int q=maxread/86400;
    if(maxread%86400!=0){
      q+=1;
    }
    System.out.print(q);
  }
}

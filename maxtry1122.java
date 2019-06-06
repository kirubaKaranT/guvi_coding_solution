import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String s=n+"";
    int m=0;
    for(int i=0;i<s.length()-1;i++){
      if(s.charAt(i)==s.charAt(i+1)){
        if(m<Integer.valueOf(s.substring(0,i)+s.substring(i+1))){
          m=Integer.valueOf(s.substring(0,i)+s.substring(i+1));
        }
        i+=1;
      }
    }
    System.out.print(m);
  }
}

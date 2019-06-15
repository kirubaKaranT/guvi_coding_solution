import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    String b=in.next();
    for(int i=0;i<a.length();i++){
      for(int j=0;j<b.length();j++){
        if(a.charAt(i)==b.charAt(j)){
          boolean sub=true;
          int k=i;
          int l=j;
          int c=0;
          while(k<a.length()&&l<b.length()){
              if(a.charAt(i)!=b.charAt(j)){
                sub=false;
              }
              k++;
              l++;
              c++;
          }
          if(sub&&c==b.length()){
            System.out.print(i);
            System.exit(0);        
          }
        }
      }
    }
    
      System.out.print(-1);
  }
}

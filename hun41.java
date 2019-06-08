import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int e=in.nextInt();
    int t=e;
 String[][] ed=new String[e][2];
  while(e-->0){
    ed[e][0]=in.next();
    ed[e][1] =in.next();
  }
  int c=0;
  String s=in.next();
  for(int i=0;i<t;i++){
    if(ed[i][0].equals(s)){
      for(int j=0;j<t;j++){
        if(ed[i][1].equals(ed[j][0])){
          c++;
        }
      }
    }
  }
    System.out.print(c);
      
  }
}

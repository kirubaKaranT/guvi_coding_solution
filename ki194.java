import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String x=in.next();
    String y=in.next();
    char a=x.charAt(0);
    char b=y.charAt(0);
    if(a==b){
      System.out.print('D');
    }
    else if((a=='R'&&b=='P')||(b=='R'&&a=='P')){
      System.out.print('P');
    }
    else if((a=='S'&&b=='P')||(b=='S'&&a=='P')){
      System.out.print('S');
    }
    else if((a=='P'&&b=='S')||(b=='P'&&a=='S')){
      System.out.print('S');
    }
    else if((a=='R'&&b=='S')||(b=='R'&&a=='S')){
      System.out.print('R');
    }
    else if((a=='P'&&b=='R')||(b=='R'&&a=='S')){
      System.out.print('P');
    }
    else if((a=='S'&&b=='R')||(b=='R'&&a=='S')){
      System.out.print('R');
    
    }
  }
}

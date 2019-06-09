import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
    String a=in.nextLine();
    String b=in.nextLine();
    int i=0;
    for(i=0;i<a.length()&&i<b.length();i++){
      System.out.println(b.charAt(i)+" "+a.charAt(i));
    }
    while(i<a.length()){
      System.out.println("  "+a.charAt(i));
      i++;
    }
    while(i<b.length()){
      System.out.println(b.charAt(i)+"  ");
      i++;
    }
  }
}

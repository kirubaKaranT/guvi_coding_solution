import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    String b=in.next();
  
    String n[]=a.split("#");
    String m[]=b.split("#");
    if(Integer.valueOf(n[1])+Integer.valueOf(n[2])+Integer.valueOf(n[3])<Integer.valueOf(m[1])+Integer.valueOf(m[2])+Integer.valueOf(m[3])){
      System.out.print(m[0]);
    }
    else{
      System.out.print(n[0]);
    }
      
      
  }
}

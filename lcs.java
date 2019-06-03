import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.next();
    String b=in.next();
    String[][] mem=new String[a.length()][b.length()];
    for(int i=0;i<b.length();i++){
      if(a.charAt(0)==b.charAt(i)){
        mem[0][i]=a.charAt(0)+"";
      }
      else{
        mem[0][i]="";
      }
    }
    for(int i=0;i<a.length();i++){
      if(b.charAt(0)==a.charAt(i)){
        mem[i][0]=b.charAt(0)+"";
      }
      else{
        mem[i][0]="";
      }
    }
    for(int i=1;i<a.length();i++){
      for(int j=1;j<b.length();j++){
        if(a.charAt(i)==b.charAt(j)){
          mem[i][j]=mem[i-1][j-1]+a.charAt(i);
        }
        else{
          if(mem[i-1][j].length()>=mem[i][j-1].length()){
            mem[i][j]=mem[i-1][j];
          }
          else if(mem[i-1][j].length()<mem[i][j-1].length()){
            mem[i][j]=mem[i][j-1];
          }
          // else{
          //   System.out.print("equal");
          // }
        }
      }
    }
    System.out.print(mem[a.length()-1][b.length()-1]);
  }
}

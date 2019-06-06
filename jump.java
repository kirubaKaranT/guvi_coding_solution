import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int c=0;
    for(int i=0;i<=n;i++){
      if(i<10){
        c++;
      }
      else if(jump(i)){
        c++;
      }
    }
    System.out.print(c);
      
  }
  public static boolean jump(int n){
    boolean jum=true;
    ArrayList<Integer> list=new ArrayList<Integer>();
    while(n>0){
      list.add(n%10);
      n=n/10;
    }
    for(int i=0;i<list.size()-1;i++){
      if(Math.abs(list.get(i)-list.get(i+1))!=1){
        jum=false;
      }
    }
    return jum;
  }
}

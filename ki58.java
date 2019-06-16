import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String[] arr=s.split(" ");
    String t=in.next();
     int c=0;
     for(int i=0;i<arr.length;i++){
       if(arr[i].equals(t)){
         c++;
       }
     }
     System.out.print(c);
  }
}

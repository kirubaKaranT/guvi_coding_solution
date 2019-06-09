import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String[] arr=s.split(" ");
      for(int i=0;i<arr.length;i++){
        String sub="";
        if(arr[i].length()>=1)
        sub=arr[i].substring(1);
        char first=arr[i].charAt(0);
      if(i!=arr.length-1)  
      System.out.print((first+"").toUpperCase()+sub+" ");
      else
      System.out.print((first+"").toUpperCase()+sub);
      }
      
      
  }
}

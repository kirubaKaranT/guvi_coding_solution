import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
    int n=in.nextInt();

    String[] arr=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=in.next();
    }

   int c=0;
    for(String s:arr){

      String k="kabali";
      if(k.length()==s.length()){
      int[] f=new int[130];
      for(int i=0;i<k.length();i++){
        f[k.charAt(i)]++;
      }
     
     for(int i=0;i<s.length();i++){
        f[s.charAt(i)]--;
      }
      boolean ki=true;
      for(int i=0;i<130;i++){
        if(f[i]!=0){
          ki=false;
          break;
        }
      }
      if(ki){
        c++;
      }
     
     }
    }
    
    
    System.out.print(c);
      
  }
}

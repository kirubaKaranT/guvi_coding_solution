import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    boolean even=false;
    for(int i=0;i<s.length();i++){
      
        char ch=s.charAt(i);
        String num="";
        for(int k=i+1;k<s.length();k++){
          if(!(s.charAt(k)>='a'&&s.charAt(k)<='z')){
            num+=s.charAt(k)+"";
          }
          else{
            i=k-1;
            break;
          }
        }
        int n=0;
        if(!num.equals(""))
         n=Integer.valueOf(num);
        if(n%2==0)
        for(int k=0;k<n;k++){
          System.out.print(ch);
        }
        else{
          System.out.print(ch+""+n);
        }
        
      
    }
    
      
  }
}

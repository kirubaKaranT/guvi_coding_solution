import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    
    int count=0;
    char kk=s.charAt(0);
    int c=1;
    for(int i=0;i<s.length()-1;i++){
    if(s.charAt(i)!=s.charAt(i+1)){
      c=1;
    }
    else{
      c++;
      if(count<c){
        count=c;
        kk=s.charAt(i);
      }
    }

    }
    //  if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
    //   c=1;
      
    // }
    // else{
      
    //   if(count<c){
    //     count=c;
    //     kk=s.charAt(s.length()-1);
    //   }
    // }
     
    
   System.out.print(kk+" "+count);
  }
}

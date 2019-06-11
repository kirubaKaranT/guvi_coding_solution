import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    boolean kk=false;
    for(int i=0;i<s.length();i++){
      if(ispal(s.substring(0,i)+s.substring(i+1))){
        kk=true;
      }
    }
    if(kk){
      System.out.print("YES");
    }
    else{
      System.out.print("NO");
    }

  }
  static boolean ispal(String kk){
	     Stack<Character> stack =new Stack<Character>();
	     for(int i=0;i<kk.length();i++){
	       stack.push(kk.charAt(i));
	   }
	   int i=0;
	   while(!stack.isEmpty())
	   {
	       if(stack.peek()==kk.charAt(i++)){
	           stack.pop();
	       }
	       else{
	           break;
	       }
	   }
	   if(stack.isEmpty()){
	      return true;
	   }
	   else{
	       return false;
	   }
	}
}

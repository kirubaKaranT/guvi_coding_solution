import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    Stack<Character> stack=new  Stack<Character>();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='('){
        stack.push('(');
      }
      else{
        if(!stack.isEmpty())
        stack.pop();
        else{
          System.out.print("no");
          System.exit(0);
        }
      }
    }
    if(stack.isEmpty()){
      System.out.print("yes");
    }
    else{
      System.out.print("no");
    }

    
   
    
  }
  
}

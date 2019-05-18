import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	   String kk=in.nextLine();
	   Stack<Character> stack=new Stack<Character>();
	   
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
	       System.out.print("YES");
	   }
	   else{
	       System.out.print("NO");
	   }
	}
}

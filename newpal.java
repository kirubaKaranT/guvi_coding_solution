import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String pal="";
		String kk=in.nextLine();
		for(int i=0;i<kk.length();i++){
		    for(int j=i+1;j<kk.length();j++){
		        if(ispal(kk.substring(i,j+1))){
		            if(kk.substring(i,j+1).length()>pal.length()){
		                pal=kk.substring(i,j+1);
		            }
		        }
		    }
		}
		System.out.print(pal);
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

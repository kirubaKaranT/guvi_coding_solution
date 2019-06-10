import java.util.*;
public class Main
{
  static int height=0;
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
    String s=in.nextLine();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!=' '){
        System.out.print(s.charAt(i));
      }
      else{
        while(s.charAt(i)==' '){
          i++;
        }

        i--;
        System.out.print(s.charAt(i));
      }
    }
    
  }
  	
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=n+"";
    int sum=0;
    int pre=0;
    for(int i=0;i<s.length();i++){  
     // sum=(sum)+find(s.substring(0,i+1));
      sum=sum+pre+Integer.valueOf(s.charAt(i)+"");
      pre=pre+Integer.valueOf(s.charAt(i)+"");
    }
    System.out.print(sum);
	}
 
}

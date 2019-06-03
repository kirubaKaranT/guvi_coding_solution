import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
    String s=n+"";
    int  sum=0;
    for(int i=0;i<s.length()-1;i++){
      sum+=Math.pow(Integer.valueOf(s.charAt(i)+""),Integer.valueOf(s.charAt(i+1)+""));
    }
    sum+=Math.pow(Integer.valueOf(s.charAt(s.length()-1)+""),Integer.valueOf(s.charAt(0)+""));
    
		System.out.print(sum);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String n=in.next();
        int[] fre=new int[300];
        for(int i=0;i<n.length();i++){
            fre[n.charAt(i)]++;
        }
        for(int i=0;i<n.length();i++){
            if(fre[n.charAt(i)]==1){
                System.out.print(n.charAt(i));
            }
        }

	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    String n=in.nextLine();
int kk=0;

for(int i=0;i<n.length();i++){
    kk+=(int)n.charAt(i);
}

   System.out.print(kk);
	}
}

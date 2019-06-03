import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
      for(int j=1;j<=(2*i)-1;j++){
        if(j<=(2*i)-2)
        System.out.print(1+" ");
        else
        System.out.print(1);
      }
      System.out.println();
    }
		
	}
}

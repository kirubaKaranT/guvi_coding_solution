import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
    String[] arr=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=in.next();
      arr[i]=arr[i].toLowerCase();
    }
    Arrays.sort(arr);
    for(int i=0;i<n;i++){
     System.out.println(arr[i]);
    }
	}
}

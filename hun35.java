import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
    String s=in.next();
    int[] arr=new int[256];
    for(Character c:s.toCharArray()){
      arr[c]++;
    }
    int c=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        c++;
      }
    }
    if(c==1)
    System.out.print("YES");
    else
    {
      System.out.print("NO");
    }
	}
  	
}

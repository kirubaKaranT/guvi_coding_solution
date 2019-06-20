import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int c=0;
    String[] arr=new String[n];
    for(int i=0;i<n;i++)
    arr[i]=in.next();
    for(int i=0;i<n;i++){
      String t=arr[i];
      for(int j=0;j<t.length();j++){
        if((t.charAt(j)>='a'&&t.charAt(j)<='z')&&(t.charAt(j)!='a'&&t.charAt(j)!='e'&&t.charAt(j)!='i'&&t.charAt(j)!='o'&&t.charAt(j)!='u')){
          c++;
          break;
        }
      }
    }
    

    if(c==n)
    System.out.print("yes");
    else
    {
      System.out.print("no");
    }
      
  }
}

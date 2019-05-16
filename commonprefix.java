import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int n=in.nextInt();
    String[] arr=new String[n];
     in = new Scanner (System.in);
    for(int i=0;i<n;i++){
        arr[i]=in.nextLine();
         in = new Scanner (System.in);
    }
    String res="";
    for(int i=0;i<arr[0].length();i++){
        char c=arr[0].charAt(i);
        int j=0;
        for( j=0;j<n;j++){
            if(arr[j].length()-1<i){
                break;
            }
            if(!(arr[j].charAt(i)==c)){
                break;
            }
        }
        if(j==n){
            res=res+c;
        }
        else{
            break;
        }
    }
    System.out.print(res);
  }
}

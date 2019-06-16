import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }   
    boolean al=true;

    for(int i=1;i<n;i++){
    if(i%2==1){
      if(arr[i-1]<arr[i]){

      }
      else{
        al=false;
      }
    }  
    else{
      if(arr[i-1]>arr[i]){

      }
      else{
        al=false;
      }
    }
    }
    if(al)
    System.out.print("yes");
    else
    System.out.print("no");
    
  }
}

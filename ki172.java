import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[10];
    while(n>0){
      int rem=n%10;
      n=n/10;
      arr[rem]++;
    }
     for(int i=9;i>=0;i--){ 
     while(arr[i]-->0){
       System.out.print(i);
     }
     }
  }
}

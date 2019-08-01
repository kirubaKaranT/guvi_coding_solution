import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    n-=1;
    int[][] mem=new int[n][2];
    for(int i=0;i<n;i++){
      mem[i][0]=in.nextInt();
      mem[i][1]=in.nextInt();
    } 
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(mem[i][0]==mem[j][0]){
          int temp=mem[i][1];
          mem[i][1]=mem[j][1];
          mem[j][1]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
    System.out.println(mem[i][0]+" "+mem[i][1]);
    
  }
}

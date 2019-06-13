import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    // HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    // ArrayList<Integer> hash=new ArrayList<Integer>();
    int n=in.nextInt();
    int k=in.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
     a[i]=in.nextInt();
    }
    int[] b=new int[n];

    for(int i=0;i<n;i++){
    int dif=Math.abs(a[i]-k);
    b[i]=dif;
    }
    
    for(int j=1;j<4;j++){
      int min=Integer.MAX_VALUE;
      int index=0;
      for(int i=0;i<n;i++){
        if(b[i]!=0&&b[i]<min){
          min=b[i];
          index=i;
        }
      }
      b[index]=Integer.MAX_VALUE;
      System.out.print(a[index]+" ");
    }

  }
}

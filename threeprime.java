import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    ArrayList<Integer> hash=new ArrayList<Integer>();
    int r=in.nextInt();
    int count=0;
    for(int i=2;i<r;i++){
      
      int sum=i;
      
      boolean prime=true;
      for(int j=2;j<sum;j++){
        if(sum%j==0){
         prime=false;
          break;
        }
      }
      if(prime)
      hash.add(sum);
      
    }
    boolean printed=true;
    for(int i=0;i<hash.size()&&printed;i++){
      for(int j=i;j<hash.size()&&printed;j++){
        for(int k=j;k<hash.size()&&printed;k++){
          if(hash.get(i)+hash.get(j)+hash.get(k)==r){
              System.out.print(hash.get(i)+" "+hash.get(j)+" "+hash.get(k));
              printed=false;
             break;
          }

        }
        
      }
    }
    // if(r==2*hash.get(hash.size()-1)){
    //       count++;
    //     }

    //System.out.print(count);
  }
}

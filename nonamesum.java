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
    
    for(int i=0;i<hash.size();i++){
      for(int j=i;j<hash.size();j++){
        if(hash.get(i)+hash.get(j)==r){
          System.out.print(hash.get(i)+" "+hash.get(j));
          
          i=hash.size();
          break;
        }
        
        
      }
    }
    

   // System.out.print(count);
  }
}

import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    for(int i=0;i<n;i++){
      int k=in.nextInt();
      if(map.containsKey(k)){
        int fre=map.get(k);
        map.put(k,fre+1);
      }
      else{
        map.put(k,1);
      }
    }
    for(Integer key:map.keySet()){
      if(map.get(key)==1){
        System.out.print(key);
        break;
      }
    }
    
    
  }
}

import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        String n=in.next();
        String m=in.next();
        boolean kk=true;
        HashMap<Character,Character> hash=new HashMap();
        if(n.length()!=m.length()){
            System.out.print("no");
        }
        else{
            for(int i=0;i<n.length();i++){
                if(hash.containsKey(n.charAt(i))){
                  if(hash.get(n.charAt(i))!=m.charAt(i)){
                      kk=false;
                  }
                }
                else{
                    hash.put(n.charAt(i),m.charAt(i));
                }
            }
          if(kk){
              System.out.print("yes");
          }  
          else{
              System.out.print("no");
          }
        }
        
	}
}

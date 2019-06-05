import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    boolean not=true;
    int max=(int)Math.pow(10,(n+"").length()+1);
    for(int i=n+1;i<max;i++){
      if(isana(new String(n+""),new String(i+""))&&isana(new String(i+""),new String(n+""))){
        System.out.print(i);
        not=false;
        break;
      }
    }
      if(not){
        System.out.print("impossible");
      }

 
  }
  public static boolean isana(String d,String s){
    boolean anagram=true;
	    HashSet<Character> hash =new HashSet<Character>();
	    for(Character c:d.toCharArray()){
	        hash.add(c);
	    }
	        if(d.length()!=s.length())
            return false;
            else{
                for(Character c:s.toCharArray()){
                    if(!hash.contains(c)){
                        anagram=false;
                        return false; 
                    }
                }
            }
                if(anagram){
                    return true;
                }
                else{
                    return false;
                }
  }
}

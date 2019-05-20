import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String n=in.next();
	String m=in.next();
      
      String res="";
      String  tem="";
      for(int i=0;i<n.length();i++){
          for(int j=0;j<m.length();j++){
              if(n.charAt(i)==m.charAt(j)){
                  tem+=n.charAt(i);
              }
              else{
                  if(res.length()<tem.length()){
                      res=tem;
                  }
              }
          }
      }
                    if(res.length()<tem.length()){
                      res=tem;
                  }
    System.out.print(res);
	}
}

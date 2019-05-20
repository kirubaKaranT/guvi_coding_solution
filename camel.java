import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String n=in.nextLine();
       boolean kk=true;
       String temp="";
       for(int i=0;i<n.length();i++){
           if(!(n.charAt(i)==' ')){
               temp+=n.charAt(i);
           }
           else{
              if(temp.charAt(0)>='a'&&temp.charAt(0)<='z') {
                  kk=false;
                  break;
              }
               temp="";
               
           }
       }
       if(temp.charAt(0)>='a'&&temp.charAt(0)<='z') {
                  kk=false;
                  
              }
              if(kk){
                  System.out.print("yes");
              }
              else{
                  System.out.print("no");
              }
       

	}
}

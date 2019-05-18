import java.util.*;
public class Main
{
  static  TreeSet<String> list=new TreeSet<String>();
	public static void main(String[] args) {
	    boolean kk=false;
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		per("",str);
		for(String i:list){
            if(kk){
                System.out.println();
            }
		    System.out.print(i);
		    kk=true;
		}
	}
	static void per(String res,String str){
	    if(str.equals("")){
	        list.add(res);
	    }
	    else{
	        for(int i=0;i<str.length();i++){
	            per(res+str.charAt(i),str.substring(0,i)+str.substring(i+1));
	        }
	    }
	}
	
}

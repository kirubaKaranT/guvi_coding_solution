import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	String kk="";
	  //  while(in.hasNext())
		kk=in.nextLine();
	
		//System.out.print(kk);
		String res="",temp="";
		for(int i=0;i<kk.length();i++){
        if(kk.charAt(i)!=' '){
            temp=kk.charAt(i)+temp;
        }
        else{
            res=res+temp+' ';
            temp="";
        }
		}
		res+=temp;
		
		System.out.print(res);
	}
}

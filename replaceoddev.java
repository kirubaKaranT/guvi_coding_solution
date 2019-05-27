/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String kk=in.nextLine();
        String res="",temp="";
        boolean odd=true;
        for(int i=0;i<kk.length();i++){
            if(!(kk.charAt(i)==' '))
            temp=temp+kk.charAt(i);
            else{
                if(odd){
                    odd=false;
                    res=res+(new StringBuffer(temp)).reverse()+" ";
                    
                }
                else{
                   
                    odd=true;
                    res=res+temp+" ";
                }
                temp="";
            }
        }
        
                if(odd){
                    odd=false;
                    res=res+(new StringBuffer(temp)).reverse();
                    
                }
                else{
                    
                    odd=true;
                    res=res+temp;
                }
                System.out.print(res);
	}
}

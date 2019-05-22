import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String kk=in.next();
		int x=0,y=0;
		int dir=1;
		for(int i=0;i<kk.length();i++){
		    if(kk.charAt(i)=='L'){
		        dir++;
		    }
		    else if(kk.charAt(i)=='R'){
		        dir--;
		    }
		    else if(kk.charAt(i)=='G') {
		        if(dir%4==1){
		            x++;
		        }
		        else if(dir%4==2){
		            y++;
		        }
		        else if(dir%4==3){
		            x--;
		        }
		        else{
		            y--;
		        }
		    }
		}
		if(x==0&&y==0){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
	}
}

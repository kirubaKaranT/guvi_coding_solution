/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner  in=new Scanner(System.in);
		int n=in.nextInt();
		int cost=0;
		int m=in.nextInt();
		char[][] arr=new char[n][m];
		for(int i=0;i<n;i++){
		    arr[i]=in.next().toCharArray();
		}
		for(int i=0;i<n;i++){
		   for(int j=1;j<m;j++){
		       if(arr[i][j]=='R'){
		           if(arr[i][j]==arr[i][j-1]){
		               arr[i][j-1]='G';
		               cost+=5;
		           }
		       }
		       else{
		           if(arr[i][j]==arr[i][j-1]){
		               arr[i][j-1]='R';
		               cost+=3;
		           }
		           
		       }
		   }
		}
            System.out.print(cost);	
	}
}

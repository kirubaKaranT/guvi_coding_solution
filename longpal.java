import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
		int pal=find(s,s.length());
		System.out.print(s.length()-pal);
	}
	public static int find(String s,int n){
	    boolean[][] mem=new boolean[n+1][n+1];
	    int maxlen=1;
	    for(int i=0;i<=n;i++){
	        mem[i][i]=true;
	    }
	    for(int i=0;i<n-1;i++){
	        if(s.charAt(i)==s.charAt(i+1)){
	            mem[i][i+1]=true;
	            maxlen=2;
	        }
	    }
	    for(int len=3;len<=n;len++){
	        for(int i=0;i<=n-len;i++){
	            int j=i+len-1;
	            if(s.charAt(i)==s.charAt(j)&&mem[i+1][j-1]){
	                mem[i][j]=true;
	                maxlen=len;
	            }
	        }
	    }
	    return maxlen;
	}
}

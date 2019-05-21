import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String x=in.next();
		String y=in.next();
		int n=x.length(),m=y.length(),i=0,j=0;
        int kk=0;
        while(i<n&&j<m){
            if(!(x.charAt(i++)==y.charAt(j++))){
                kk++;
            }
        }		
        kk+=Math.abs(m-n);
        
        System.out.print(kk);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("1");
			if(j<=n-i){
				System.out.print(" ");
			}
	    }
		
            
            System.out.print("\n");
        }

	}
}

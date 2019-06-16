import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n==0)
		{
			System.out.print(1);
		}
		else{
		for (int i = 0; i < n; i++) 
		{ 
			System.out.print(catalan(i));
				if(i<n-1)
				{
					System.out.print(" ");
				}
		}
		}
      
  }
 public static  int catalan(int n) { 
        int res = 0; 
          
        // Base case 
        if (n <= 1) { 
            return 1; 
        } 
        for (int i = 0; i < n; i++) { 
            res += catalan(i) * catalan(n - i - 1); 
        } 
        return res; 
    } 
}

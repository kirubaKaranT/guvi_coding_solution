import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	boolean kk=true;
	int n=in.nextInt();
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++)
    arr[i]=in.nextInt();
    
    int[] fre=new  int[10000000];
    
    for(Integer i:arr)
        fre[i]++;
    
    for(int i=0;i<fre.length;i++){
        if(fre[i]==1){
            System.out.print(i);
        }
    }
    
	}
}

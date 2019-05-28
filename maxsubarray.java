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
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    int max=0,temp=1;
    for(int i=1;i<n;i++){
        if(arr[i]>arr[i-1]){
            temp++;
        }
        else{
            if(max<temp){
                max=temp;
            }
            temp=1;
        }
    }
        if(max<temp){
                max=temp;
            }
            System.out.print(max);
	}
}

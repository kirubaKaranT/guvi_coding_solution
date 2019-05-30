/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    HashSet<Integer> zerorow=new HashSet<Integer>();
     HashSet<Integer> zerocol=new HashSet<Integer>();
    int[][] arr=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        int t=in.nextInt();
        arr[i][j]=t;
        if(t==0){
          zerorow.add(i);
          zerocol.add(j);
        }
      }
    }
    for(Integer  item:zerorow){
      for(int j=0;j<m;j++){
        arr[item][j]=0;
      }
    }
    for(Integer  item:zerocol){
      for(int j=0;j<n;j++){
        arr[j][item]=0;
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
      	if(j!=m-1)
        System.out.print(arr[i][j]+" ");
		else{
			System.out.print(arr[i][j]);
		}
      }
      System.out.println();
      }
	}
}

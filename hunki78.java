//ki
import java.util.*;
public class Main
{
	
	
	
  static int height=0;
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
    int node=in.nextInt();
    int e=in.nextInt();
    int[][] path=new int[e][2];
    if(e==0){
    System.out.print(1);  
    
    }
    else{
    while(e-->0){
      path[e][0]=in.nextInt();
      path[e][1]=in.nextInt();

    }
    find(path,1,path[path.length-1][0]);
    System.out.print(height);
	}
  }
  public static void find(int[][] path,int h,int l){
    
    for(int i=0;i<path.length;i++){
      if(path[i][0]==l){  
       // System.out.print(path[i][0]+" "+path[i][1]);
        find(path,h+1,path[i][1]);
      }
    }
    if((h)>height){
      height=h;
    }
  }
  	
}

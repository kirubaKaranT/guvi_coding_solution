import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String[] arr=s.split(" ");
   
     for(int i=0;i<arr.length;i++){
       if(arr[i].equals("and")){
         String t=arr[i-1];
         arr[i-1]=arr[i+1];
         arr[i+1]=t;
       }
     }
     for(int i=0;i<arr.length;i++){ 
     if(i!=arr.length-1)
     System.out.print(arr[i]+" ");
     else{
       System.out.print(arr[i]);
     }
     }
  }
}

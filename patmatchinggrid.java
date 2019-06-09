import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    char[][] arr={{'W','E','L','C','O'},
                  {'M','E','T','O','G'},
                  {'U','V','I','C','O'},
                  {'R','P','O','R','A'},
                  {'T','I','O','N','S'}
                  };
    String s=in.next();
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(arr[i][j]==s.charAt(0)){
          //col check
          
          boolean kk=true;
          int d=0;
          for(int k=j;d<s.length()&&k<5;k++){
              if(arr[i][k]!=s.charAt(d)){
                kk=false;
                break;
              }
              d++;
          }
          if(kk&&d==s.length()){
            System.out.println(i+" "+j);
            System.out.print(i+" "+(j+s.length()-1));
            System.exit(0);
          }
          kk=true;
          d=0;
          for(int k=i;d<s.length()&&k<5;k++){
              if(arr[k][j]!=s.charAt(d)){
               // System.out.println(arr[k][j]);
                kk=false;
              }
              d++;
          }
          if(kk&&d==s.length()){
            System.out.println(i+" "+j);
            System.out.print((i+s.length()-1)+" "+j);
             System.exit(0);

          }

        }
      }
    }
    System.out.print(0);
   
  }
}

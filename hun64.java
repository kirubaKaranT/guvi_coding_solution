import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int th=0,five=0,hun=0,fif=0,ten=0;
    if(n>1000){
      th+=n/1000;
      n-=(th*1000);
    }
    if(n>500){
      five+=n/500;
      n-=(five*500);
    }
    if(n>100){
      hun+=n/100;
      n-=(hun*100);
    }
    if(n>50){
      fif+=n/50;
      n-=(fif*50);
    }
    if(n>10){
      ten+=n/10;
      n-=(ten*10);
    }
    


      System.out.print(th+five+hun+fif+ten+n);
      
  }

}

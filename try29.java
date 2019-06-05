import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
ArrayList<Integer> t1=new ArrayList<Integer>();
   ArrayList<Integer> t2=new ArrayList<Integer>();
   ArrayList<Integer> list=new ArrayList<Integer>();
   for(int i=0;i<n;i++){
   list.add(in.nextInt());
   t1.add(list.get(i));
   }

  while(t1.size()!=1&&t2.size()!=1){
    if(t1.size()!=1){
      for(int i=0;i<t1.size();i++){
        if(i%2==1)
        t2.add(t1.get(i));
      }
  t1=new ArrayList<Integer>();
    }
    if(t2.size()!=1){
      for(int i=0;i<t2.size();i++){
        if(i%2==1)
        t1.add(t2.get(i));
      }
  t2=new ArrayList<Integer>();
    }
  }
  int item;
  if(t1.size()==1){
    item=t1.get(0);
  }
  else{
    item=t2.get(0);
  }

     int pos=0;
  for(int i=0;i<n;i++){
  if(item==list.get(i)){
    pos=i;
  }
  }

   System.out.print(pos);
      
  }
}

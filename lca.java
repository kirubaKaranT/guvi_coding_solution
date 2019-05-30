
import java.util.*;
class Node{
    int val;
    Node l;
    Node r;
    Node(int i){
        val=i;
        l=null;
        r=null;
    }

}

public class Main
{
    static  Node head=null;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
 		int n=in.nextInt();
 		for(int i=0;i<n;i++){
 		    int item=in.nextInt();
 		    insert(item);
 		}
 		int u=in.nextInt();
 		int v=in.nextInt();
 		System.out.print(find(head,u,v));
  //      insert(5);
        //insert(1,head);
      //  System.out.print(head.val);
        //print(head);
    }
//    public  static void print(Node t){
//        if(t!=null){
//            System.out.println(t.val);
//            print(t.l);
//            print(t.r);
//        }

   // }
    public static int find(Node h,int u,int v){

        if(h!=null&&h.val<u&&h.val<v){
          return   find(h.r,u,v);
        }
        else if(h!=null&&h.val>u&&h.val>v){
            return  find(h.l,u,v);
        }

        else
            return h.val;

    //return 0;
    }
    public static void  insert(int item){
        if(head==null){
            head=new Node(item);
        }
        else if(head!=null){
            Node temp=head;
            while(temp!=null){
                if(temp.val<item){
                    if(temp.r==null){
                        temp.r=new Node(item);
                        break;
                    }
                    else{
                       temp=temp.r;

                    }
                }
                else{
                    if(head.l==null){
                        head.l=new Node(item);
                        break;
                    }
                    else{
                       temp=temp.r;
                    }
                }
            }
        }
    }
}

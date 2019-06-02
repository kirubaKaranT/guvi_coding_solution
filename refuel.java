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
		int dis=in.nextInt();
    int fuel=in.nextInt();
    int station=in.nextInt();
    int n=in.nextInt();
   
    int refuel=0;
    int tank=fuel;
    Boolean forward=true;
    fuel=fuel-station;
    while(n-->0){
      if(forward){
        if(n==0&&(dis-station)>fuel){
         fuel=tank;
          refuel++;
        }
        else if(n!=0&&2*(dis-station)>fuel){
         fuel=tank;
         refuel++;
         if(2*(dis-station)>fuel){
           refuel=-1;
           break;
         }

         
        }
       fuel=fuel-(2*(dis-station));
        forward=false;
      }
      else{
        if(n==0&&station>fuel){
          fuel=tank;
          refuel++;
        }

        else if(n!=0&&2*station>fuel){
          fuel=tank;
          if(2*station>fuel){
            refuel=-1;
            break;
          }
          refuel++;
        }
       fuel=fuel-2*station;
       
        forward=true;
      }
    }
		System.out.print(refuel);
	}
}

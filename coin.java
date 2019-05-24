import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        int val=in.nextInt();
        
        int[] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=in.nextInt();
        }
        

        System.out.println(find(coins,val,coins.length));

    }

    private static int find(int[] coins, int val, int length) {
    int[] mem=new int[val+1];
        Arrays.sort(coins);
        for(int i=1;i<=val;i++){

            for(int j=0;j<length;j++){
                int req=i;
                if(req-coins[j]==0){
                    mem[i]=1;
                    break;
                }
                else if(req-coins[j]<0){
                //overloaded value kk
                }
                else {
                    req=req-coins[j];
                    if(mem[req]!=0){
                        mem[i]=mem[req]+1;
                    }
                }

            }
        }



        return mem[val];
    }

}

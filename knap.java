import  java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int w=in.nextInt();
        int[] val=new int[n];
        int[] wei=new int[n];
        
        for(int i=0;i<n;i++){
            wei[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i]=in.nextInt();
        }
        System.out.print(find(val,wei,n,w));
    }

    private static int find(int[] val, int[] wei, int n, int w) {
        int[][] mem=new int[n+1][w+1];
        for(int j=0;j<=w;j++){
            mem[0][j]=0;
        }
        for(int i=0;i<=n;i++)
            mem[i][0]=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(j-wei[i-1]<0){
                    mem[i][j]=mem[i-1][j];
                }
                else{
                    int t=mem[i-1][j-wei[i-1]]+val[i-1];
                    mem[i][j]=Math.max(t,mem[i-1][j]);
                }
            }
        }

        return mem[n][w];
    }
}

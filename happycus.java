import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        int n=input.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
		{
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        
        int time=0;
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            if(time<=arr[i])
			{
                count++;
			}
            time+=arr[i];
        }
        System.out.println(count);
		
    }
}

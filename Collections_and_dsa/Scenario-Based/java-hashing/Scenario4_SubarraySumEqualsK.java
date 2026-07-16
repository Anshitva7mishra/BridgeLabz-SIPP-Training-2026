
import java.util.*;

public class Scenario4_SubarraySumEqualsK {

    public static int subarraySumEqualsK(int[] arr,int k){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ans=0;
        for(int x:arr){
            sum+=x;
            ans+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(subarraySumEqualsK(arr,k));
        sc.close();
    }
}

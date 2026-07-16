
import java.util.*;

public class Scenario3_FraudPair {

    public static int[] findFraudPair(int[] amounts,int target){
        Map<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<amounts.length;i++){
            int comp=target-amounts[i];
            if(seen.containsKey(comp)){
                return new int[]{seen.get(comp),i};
            }
            seen.put(amounts[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt();
        int[] ans=findFraudPair(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
        sc.close();
    }
}

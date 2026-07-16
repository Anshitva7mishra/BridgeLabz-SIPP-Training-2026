import java.util.*;

public class Scenario1_PairSum {
    public static int[] findPairSum(int[] transactions,int target){
        int left=0,right=transactions.length-1;
        while(left<right){
            int sum=transactions[left]+transactions[right];
            if(sum==target) return new int[]{transactions[left],transactions[right]};
            else if(sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] transactions={5000,7000,12000,18000,32000,38000};
        System.out.println(Arrays.toString(findPairSum(transactions,50000)));
    }
}

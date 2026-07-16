
import java.util.*;

public class Scenario6_LongestConsecutiveRun {

    public static int longestConsecutiveRun(int[] ids){
        Set<Integer> set=new HashSet<>();
        for(int x:ids) set.add(x);
        int longest=0;
        for(int id:set){
            if(!set.contains(id-1)){
                int cur=id;
                int len=1;
                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(longestConsecutiveRun(arr));
        sc.close();
    }
}

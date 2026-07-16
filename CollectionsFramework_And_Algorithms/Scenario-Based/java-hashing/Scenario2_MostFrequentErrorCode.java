
import java.util.*;

public class Scenario2_MostFrequentErrorCode {

    public static int mostFrequentErrorCode(int[] codes) {
        Map<Integer,Integer> freq = new HashMap<>();
        int bestCode = codes[0], bestCount = 0;
        for (int code : codes) {
            int count = freq.merge(code,1,Integer::sum);
            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }
        return bestCode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(mostFrequentErrorCode(arr));
        sc.close();
    }
}

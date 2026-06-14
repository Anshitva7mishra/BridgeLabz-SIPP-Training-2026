import java.util.HashSet;
import java.util.Set;

public class lC_217Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int ele: nums){
            if(!st.add(ele)) return true;
        }
        return false;
    }
}
public class lC_169_Majority_Element {
    public int majorityElement(int[] arr) {
        int ele = 0;
        int con = 0;
        for (int i = 0; i < arr.length; i++) {
            if (con == 0) {
                ele = arr[i];
                con = 1;
            } else if (arr[i] == ele)
                con++;
            else
                con--;
        }
        con = 0;
        for (int val : arr) {
            if (val == ele)
                con++;
        }

        if (con > arr.length / 2)
            return ele;
        else
            return 0;
    }
}
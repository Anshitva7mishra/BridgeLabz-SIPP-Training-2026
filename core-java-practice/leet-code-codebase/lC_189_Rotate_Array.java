public class lC_189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int m = k % n;
        rotArr(nums, 0, n - 1);
        rotArr(nums, 0, m - 1);
        rotArr(nums, m, n - 1);
    }

    public void rotArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
public class recursivePuzzles {
    public static int hanoiMoves = 0;

    public static void main(String[] args) {
        solveHanoi(3, 'A', 'C', 'B');
        System.out.println(hanoiMoves);
    }

    public static void solveHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) return;
        solveHanoi(n - 1, from_rod, aux_rod, to_rod);
        hanoiMoves++;
        solveHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean checkBalanced(String str, int index, int count) {
        if (index == str.length()) return count == 0;
        if (count < 0) return false;
        if (str.charAt(index) == '(') return checkBalanced(str, index + 1, count + 1);
        if (str.charAt(index) == ')') return checkBalanced(str, index + 1, count - 1);
        return checkBalanced(str, index + 1, count);
    }
}

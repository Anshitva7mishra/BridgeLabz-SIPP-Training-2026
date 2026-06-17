import java.util.Scanner;

public class consecutiveSensorReadings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of readings: ");
        int n = input.nextInt();
        int[] readings = new int[n];
        System.out.println("Enter readings:");
        for (int i = 0; i < n; i++) {
            readings[i] = input.nextInt();
        }
        System.out.println(isStrictlyIncreasing(readings, 0));
        input.close();
    }

    public static boolean isStrictlyIncreasing(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            return false;
        }
        return isStrictlyIncreasing(arr, index + 1);
    }
}

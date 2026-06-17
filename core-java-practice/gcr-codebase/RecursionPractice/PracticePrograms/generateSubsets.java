import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class generateSubsets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        List<Integer> currentSubset = new ArrayList<>();
        findSubsets(arr, 0, currentSubset);
        input.close();
    }

    public static void findSubsets(int[] arr, int index, List<Integer> currentSubset) {
        if (index == arr.length) {
            System.out.println(currentSubset);
            return;
        }
        
        findSubsets(arr, index + 1, currentSubset);
        
        currentSubset.add(arr[index]);
        findSubsets(arr, index + 1, currentSubset);
        
        currentSubset.remove(currentSubset.size() - 1);
    }
}

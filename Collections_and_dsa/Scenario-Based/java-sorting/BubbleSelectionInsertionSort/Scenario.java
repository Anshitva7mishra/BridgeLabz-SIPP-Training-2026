import java.util.*;

public class Scenario {

    static int bubbleSort(int[] arr) {
        int swaps = 0;
        boolean alreadySorted = true;

        System.out.println("Bubble Sort Trace:");
        System.out.println("Initial: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                break;
            } else {
                alreadySorted = false;
            }
        }

        System.out.println("Bubble Sorted Array: " + Arrays.toString(arr));
        System.out.println("Total Swaps: " + swaps);
        System.out.println("Already Sorted: " + (alreadySorted ? "Yes" : "No"));
        return swaps;
    }

    static void insertionSort(int[] arr) {
        System.out.println("\nInsertion Sort Trace:");
        System.out.println("Initial: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Insertion Sorted Array: " + Arrays.toString(arr));
    }

    static void top3Medalists(int[] scores) {
        int[] arr = scores.clone();

        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println("\nTop 3 Medalists:");
        System.out.println("Gold   : " + arr[0]);
        System.out.println("Silver : " + arr[1]);
        System.out.println("Bronze : " + arr[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of athletes: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int[] bubbleArray = scores.clone();
        int[] insertionArray = scores.clone();

        bubbleSort(bubbleArray);
        insertionSort(insertionArray);
        top3Medalists(scores);

        System.out.println("\nBubble Sort Pass-by-Pass Trace for [64, 25, 12, 22, 11]:");
        int[] trace = {64, 25, 12, 22, 11};
        bubbleSort(trace);
    }
}

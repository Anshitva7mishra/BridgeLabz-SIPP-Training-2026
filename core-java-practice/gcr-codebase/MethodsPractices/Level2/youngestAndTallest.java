import java.util.Scanner;

public class youngestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }
        System.out.println(findYoungest(ages));
        System.out.println(findTallest(heights));
        input.close();
    }

    public static int findYoungest(int[] ages) {
        return Math.min(ages[0], Math.min(ages[1], ages[2]));
    }

    public static double findTallest(double[] heights) {
        return Math.max(heights[0], Math.max(heights[1], heights[2]));
    }
}

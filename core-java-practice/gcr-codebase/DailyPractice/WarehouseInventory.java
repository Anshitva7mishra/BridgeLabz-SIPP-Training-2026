import java.util.Scanner;
import java.util.Arrays;

public class WarehouseInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] stock = {50, 120, 30, 200, 80, 50, 120, 10};
        System.out.println("Current Stock: " + Arrays.toString(stock));
        
        findMaxMinTotal(stock);
        detectDuplicates(stock);
        
        System.out.print("\nEnter k positions to rotate: ");
        int k = input.nextInt();
        int[] rotated = rotateStock(stock, k);
        System.out.println("Rotated Stock: " + Arrays.toString(rotated));
        
        System.out.println("\n--- 2D Shelf Grid Transpose ---");
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Grid:");
        printGrid(grid);
        
        int[][] transposed = transposeGrid(grid);
        System.out.println("Transposed Grid:");
        printGrid(transposed);
        
        input.close();
    }
    
    public static void findMaxMinTotal(int[] stock) {
        if (stock.length == 0) return;
        int max = stock[0];
        int min = stock[0];
        int total = 0;
        
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] > max) max = stock[i];
            if (stock[i] < min) min = stock[i];
            total += stock[i];
        }
        
        System.out.println("Max stock: " + max);
        System.out.println("Min stock: " + min);
        System.out.println("Total stock: " + total);
    }
    
    public static void detectDuplicates(int[] stock) {
        System.out.print("Duplicate quantities found: ");
        boolean found = false;
        boolean[] visited = new boolean[stock.length];
        
        for (int i = 0; i < stock.length; i++) {
            if (visited[i]) continue;
            boolean isDuplicate = false;
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    isDuplicate = true;
                    visited[j] = true;
                }
            }
            if (isDuplicate) {
                System.out.print(stock[i] + " ");
                found = true;
            }
        }
        if (!found) System.out.print("None");
        System.out.println();
    }
    
    public static int[] rotateStock(int[] stock, int k) {
        int n = stock.length;
        if (n == 0) return stock;
        k = k % n;
        if (k < 0) k += n;
        
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }
        return rotated;
    }
    
    public static int[][] transposeGrid(int[][] grid) {
        if (grid.length == 0) return new int[0][0];
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = grid[i][j];
            }
        }
        return transposed;
    }
    
    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

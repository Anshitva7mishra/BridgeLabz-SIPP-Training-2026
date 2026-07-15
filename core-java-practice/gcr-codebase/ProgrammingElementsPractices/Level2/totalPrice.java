import java.util.Scanner;

public class totalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter unit price of the item (INR): ");
        double unitPrice = input.nextDouble();
        
        System.out.print("Enter quantity to buy: ");
        int quantity = input.nextInt();
        
        double totalPriceValue = unitPrice * quantity;
        
        System.out.println("The total purchase price is INR " + totalPriceValue + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}

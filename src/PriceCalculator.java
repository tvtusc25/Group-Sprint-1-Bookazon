import java.util.ArrayList;

public class PriceCalculator {
    public static double calculateTotalPrice(ArrayList<CartItem> items, double discount) {
        double totalPrice = 0.0;

        for (CartItem item : items) { 
            totalPrice += item.getTotalPrice();
        }

        return totalPrice * discount;
    }
}
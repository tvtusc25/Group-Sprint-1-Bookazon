import java.util.ArrayList;

public class PriceCalculator{

    String subscription;
    double discount;
    Cart cart;
    ArrayList<CartItem> items;

    public PriceCalculator(String subscription, Cart cart){
        if (subscription == "gold"){
            this.discount = 1-0.15;
        }
        else if (subscription == "platinum"){
            this.discount = 1-0.1;
        }
        else if (subscription == "silver"){
            this.discount = 1-0.05;
        }
        else{
            this.discount = 1.0;
        }

        this.cart = new Cart();

    }

    public double calculateTotalPrice(Cart cart) {
        double totalPrice = 0.0;
        this.items = cart.getItems();

        for (CartItem item : items) { 
            totalPrice += item.getTotalPrice();
        }

        return calculatePrice(totalPrice);
    }


    public double calculatePrice(double totalPrice) {
        return totalPrice * this.discount;
    }

}
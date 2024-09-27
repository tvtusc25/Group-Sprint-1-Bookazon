import java.util.ArrayList;

public class PriceCalculator{

    Sring subscription;
    double discount;

    public PriceCalculator(String subscription){
        if (subscription == "gold"){
            this.discount = 0.15;
        }
        if (subscription == "platinum"){
            this.discount = 0.1;
        }
        if (subscription == "silver"){
            this.discount = 0.05;
        }

    }


    public double calculatePrice(String subscription) {
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        totalPrice = totalPrice * this.discount;

        return totalPrice;
    }

}
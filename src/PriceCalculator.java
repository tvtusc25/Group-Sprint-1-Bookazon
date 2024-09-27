import java.util.ArrayList;

public class PriceCalculator{

    String subscription;
    double discount;

    public PriceCalculator(String subscription){
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

    }


    public double calculatePrice(double totalPrice) {
        return totalPrice * this.discount;
    }

}
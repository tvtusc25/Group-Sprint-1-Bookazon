import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private LocalDate dateCreated;
    private LocalDate dateShipped;
    private String userName;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private ArrayList<CartItem> items;
    private double orderPrice;
    private double discountMultipler;

    public Order(Cart cart, Subscription subscription) {
        this.items = cart.getItems();
        this.discountMultipler = subscription.getDiscountMultiplier();
        this.orderPrice = PriceCalculator.calculateTotalPrice(items, discountMultipler);
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(LocalDate date) {
        this.dateCreated = date;
    }

    public void setDateShipped(LocalDate date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void checkout(String userName, Address shippingAddress, Address billingAddress){
        this.setShippingAddress(shippingAddress);
        this.setBillingAddress(billingAddress);
        this.setOrderStatus("Order Placed");
        this.setDateCreated(LocalDate.now());
        this.setUserName(userName);
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Discount: " + Math.round((1 - this.discountMultipler) * 100) + "%");
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingAddress.toString());
        System.out.println("Billing Address: " + billingAddress.toString());
        System.out.println("Order Price: $" + orderPrice);
    }


}
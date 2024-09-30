
import java.util.ArrayList;

public class User {
    private String name;
    private Subscription subscription;
    private ArrayList<Order> orders;
    private Cart cart;
    private Address shippingAddress;
    private Address billingAddress;

    public User(String name, Subscription subscription, Cart cart) {
        this.name = name;
        this.subscription = subscription;
        this.cart = cart;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSubscription() {
        return subscription.name();
    }

    public Subscription getSubscriptionObject(){
        return this.subscription;
    }

    public Cart getCart(){
        return this.cart; 
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public void viewCart() {
        cart.viewCartDetails();
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void addToCart(CartItem cartItem) {
        cart.addItem(cartItem);
    }

    public void removeFromCart(Media media) {
        cart.removeItem(media.getTitle());
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout(Order order) {
        order.checkout(this.name, this.shippingAddress, this.billingAddress);
        this.orders.add(order); 
    }
}



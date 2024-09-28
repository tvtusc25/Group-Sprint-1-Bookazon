
import java.util.ArrayList;

public class User {
    private String name;
    private Subscription subscription;
    private Cart cart;
    private ArrayList<Order> orders;
    private Address shippingAddress;
    private Address billingAddress;

    public User(String name, Subscription subscription) {
        this.name = name;
        this.subscription = subscription;
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSubscription() {
        return subscription.name();
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

    public void addToCart(Media media, int quantity) {
        CartItem newItem = new CartItem(media.getTitle(), media.getPrice(), quantity);
        cart.addItem(newItem);
        cart.updateQuantity(newItem, quantity);
    }

    public void removeFromCart(Media media) {
        for (CartItem item : cart.getItems()) {
            if (item.getName().equals(media.getTitle())) {
                cart.getItems().remove(item);
                break;
            }
        }
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout() {
        Order order = new Order(cart, this.subscription);
        order.setShippingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
        order.setBillingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        order.setUserName(this.name);
        orders.add(order);
    }
}



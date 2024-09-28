public enum Subscription {
    NORMAL(1.00),    // No discount
    SILVER(0.95),    // 5% discount
    GOLD(0.85),      // 15% discount
    PLATINUM(0.90);  // 10% discount

    private final double discountMultiplier;

    Subscription(double discountMultiplier) {
        this.discountMultiplier = discountMultiplier;
    }

    public double getDiscountMultiplier() {
        return discountMultiplier;
    }
}
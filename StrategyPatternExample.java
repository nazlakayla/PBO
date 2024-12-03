package behavioral;

// Interface Strategy
interface DiscountStrategy {
    double applyDiscount(double price);
}

// ConcreteStrategy 1: Diskon Persentase
class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * (percentage / 100));
    }
}

// ConcreteStrategy 2: Diskon Tetap
class FixedDiscount implements DiscountStrategy {
    private double discount;

    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }
}

// ConcreteStrategy 3: Tanpa Diskon
class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}

// Context: Keranjang Belanja
class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice(double price) {
        return discountStrategy.applyDiscount(price);
    }
}

// Main Class
public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Gunakan Diskon Persentase
        cart.setDiscountStrategy(new PercentageDiscount(10)); // 10%
        System.out.println("Harga Akhir (10% Diskon): " + cart.calculateFinalPrice(100));

        // Gunakan Diskon Tetap
        cart.setDiscountStrategy(new FixedDiscount(15)); // Diskon Rp15
        System.out.println("Harga Akhir (Diskon Tetap Rp15): " + cart.calculateFinalPrice(100));

        // Tanpa Diskon
        cart.setDiscountStrategy(new NoDiscount());
        System.out.println("Harga Akhir (Tanpa Diskon): " + cart.calculateFinalPrice(100));
    }
}

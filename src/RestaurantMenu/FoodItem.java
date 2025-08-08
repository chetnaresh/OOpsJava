package RestaurantMenu;

// Abstraction
abstract class FoodItem {
    private double price;
    private int prepTime;

    public FoodItem(double price, int prepTime) {
        this.price = price;
        this.prepTime = prepTime;
    }

    public double getPrice() {
        return price;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public abstract void displayIngredients();

    public void orderItem() {
        System.out.println("Order placed for: " + getClass().getSimpleName());
        System.out.println("Price: ₹" + price);
        System.out.println("Preparation Time: " + prepTime + " minutes");
        displayIngredients();
        System.out.println("====================================");
    }
}

package RestaurantMenu;

class Burger extends FoodItem {
    public Burger() {
        super(200.0, 10);
    }

    @Override
    public void displayIngredients() {
        System.out.println("Ingredients: Bun, Patty, Lettuce, Cheese, Sauce");
    }
}

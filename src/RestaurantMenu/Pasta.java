package RestaurantMenu;

class Pasta extends FoodItem {
    public Pasta() {
        super(250.0, 15);
    }

    @Override
    public void displayIngredients() {
        System.out.println("Ingredients: Pasta, Olive Oil, Vegetables, Spices");
    }
}

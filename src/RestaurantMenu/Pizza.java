package RestaurantMenu;

class Pizza extends FoodItem {
    public Pizza() {
        super(350.0, 20);
    }

    @Override
    public void displayIngredients() {
        System.out.println("Ingredients: Dough, Tomato Sauce, Cheese, Toppings");
    }
}

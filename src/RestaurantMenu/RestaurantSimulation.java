package RestaurantMenu;

public class RestaurantSimulation {
    public static void main(String[] args) {
        FoodItem order1 = new Pizza();
        FoodItem order2 = new Burger();
        FoodItem order3 = new Pasta();

        order1.orderItem();
        order2.orderItem();
        order3.orderItem();
    }
}

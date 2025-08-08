package VehicleSimulation;

public class ToolSimulation {
    public static void main(String[] args) {
        // Polymorphism: Using common Vehicle reference
        Vehicle v1 = new Bike("KA-01-AB-1234", 5);
        Vehicle v2 = new Car("KA-02-CD-5678", 10);
        Vehicle v3 = new Truck("KA-03-EF-9012", 20);

        System.out.println("=== Toll Booth Records ===");
        v1.displayDetails();
        v2.displayDetails();
        v3.displayDetails();

        // Total Toll Calculation
        double total = v1.getTollAmount() + v2.getTollAmount() + v3.getTollAmount();
        System.out.println("Total Toll Collected: ₹" + total);
    }
}

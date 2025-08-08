package VehicleSimulation;

abstract class Vehicle {
    private String plateNumber; // Encapsulation
    private double tollAmount;  // Encapsulation
    private int stayDuration;   // in minutes

    public Vehicle(String plateNumber, double tollAmount, int stayDuration) {
        this.plateNumber = plateNumber;
        this.tollAmount = tollAmount;
        this.stayDuration = stayDuration;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getTollAmount() {
        return tollAmount;
    }

    public int getStayDuration() {
        return stayDuration;
    }

    // Abstraction
    public abstract String getVehicleType();

    public void displayDetails() {
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Toll Amount: ₹" + tollAmount);
        System.out.println("Stay Duration: " + stayDuration + " minutes");
        System.out.println("------------------------------");
    }
}

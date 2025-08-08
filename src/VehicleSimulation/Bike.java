package VehicleSimulation;
class Bike extends Vehicle {
    public Bike(String plateNumber, int stayDuration) {
        super(plateNumber, 30.0, stayDuration); // ₹30 toll
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }
}

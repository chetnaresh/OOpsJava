package VehicleSimulation;

class Car extends Vehicle {
    public Car(String plateNumber, int stayDuration) {
        super(plateNumber, 60.0, stayDuration); // ₹60 toll
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}

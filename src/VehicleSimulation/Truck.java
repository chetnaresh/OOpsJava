package VehicleSimulation;
class Truck extends Vehicle {
    public Truck(String plateNumber, int stayDuration) {
        super(plateNumber, 120.0, stayDuration); // ₹120 toll
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }
}


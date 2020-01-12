package OOP.parking;

public class ParkingSpot {
    private VehicleSize type;
    private Vehicle vehicle;

    public VehicleSize getType() {
        return type;
    }

    public void setType(VehicleSize type) {
        this.type = type;
    }

    public boolean park(Vehicle v) {
        if(!v.catFitInSpot(this)) return false;

        this.vehicle = v;
        return true;
    }
}

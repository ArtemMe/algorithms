package OOP.parking;

public class Motorcycle extends Vehicle {
    @Override
    public boolean catFitInSpot(ParkingSpot spot) {
        return spot.getType() == VehicleSize.MOTORCYCLE;
    }
}

package OOP.parking;

public class Car extends Vehicle {
    @Override
    public boolean catFitInSpot(ParkingSpot spot) {
        return spot.getType() == VehicleSize.LARG || spot.getType() == VehicleSize.COMPACT;
    }
}

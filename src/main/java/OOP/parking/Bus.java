package OOP.parking;

public class Bus extends Vehicle {
    @Override
    public boolean catFitInSpot(ParkingSpot spot) {
        return spot.getType() == VehicleSize.LARG ;
    }
}

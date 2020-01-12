package OOP.parking;

/**
 * Базовый тип для транспорта
 * */
public abstract class Vehicle {
    private int spotsNeeded;
    private VehicleSize type;

    public abstract boolean catFitInSpot(ParkingSpot spot);

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public void setSpotsNeeded(int spotsNeeded) {
        this.spotsNeeded = spotsNeeded;
    }

    public VehicleSize getType() {
        return type;
    }

    public void setType(VehicleSize type) {
        this.type = type;
    }
}

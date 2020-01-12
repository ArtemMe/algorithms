package OOP.parking;
/**
 *  Разработайте модель автостоянки, используя принципы ООП.
 *  Нужно уточнить какие машины будут на парковке сколько уровней. Сколько места занимают машины.
 *
 *  У нас будет 3 вида техники: машины, мотоциклы, автобусу.
 *  Виды мест: мотоциклетное, компактное, большое.
 *  Машина может занимать большое и компактное место.
 *  Мотоцикл может занимать мотоциклетное место.
 *  Автобусу нужно 4 больших места
 *
 *  Объекты:
 *      1. Виды машин (Car, Motorcycle, Bus, Vehicle)
 *      2. Парковочная площадка (ParkingLot)
 *      3. Парковочное место (ParkingSpot)
 *      4. Уровень парковки
 *
 *  Действия:
 *      1. Возможность припарковать машину.
 *      2. Узнать загруженность.
 * */
public class ParkingLot {
    private ParkingSpot[] spots;
    private int availableSpots;

    public boolean parkVehicle(Vehicle vehicle) {
        if(getAvailableSpots() < vehicle.getSpotsNeeded()) return false;

        int startNumber = findAvailableSpots(vehicle);

        if(startNumber < 0) return false;

        return parkVehicle(startNumber, vehicle);
    }

    private boolean parkVehicle(int startNumber, Vehicle vehicle) {
        boolean success = true;
        for(int i=startNumber; i<spots.length; i++) {
            success &= spots[i].park(vehicle);
        }

        availableSpots -= vehicle.getSpotsNeeded();
        return success;
    }

    private int findAvailableSpots(Vehicle vehicle) {
        int spotCounter = 0;
        for(int i=0;i<spots.length;i++) {
            ParkingSpot spot = spots[i];
            if(vehicle.catFitInSpot(spot)) {
                spotCounter++;
            } else {
                spotCounter = 0;
            }

            if(spotCounter == vehicle.getSpotsNeeded()) return i - spotCounter;
        }
        return -1;
    }

    public ParkingSpot[] getSpots() {
        return spots;
    }

    public void setSpots(ParkingSpot[] spots) {
        this.spots = spots;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }
}

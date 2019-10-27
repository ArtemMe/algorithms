package multithreading.ship_task;

import multithreading.ship_task.ships.Ship;
import multithreading.ship_task.ships.types.Size;
import multithreading.ship_task.ships.types.Type;

import java.util.Random;

public class ShipGenerator implements Runnable{
    private Tunnel tunnel;
    private int shipCount;

    public ShipGenerator(Tunnel tunnel, int shipCount) {
        this.tunnel = tunnel;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        int count = 0;
        while(count < shipCount) {
            Thread.currentThread().setName(" Generator ship");
            count++;
            tunnel.add(new Ship(getRandomSize(), getRandomType()));
        }
    }

    private Type getRandomType() {
        Random random = new Random();
        return Type.values()[random.nextInt(Type.values().length)];
    }

    private Size getRandomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Type.values().length)];
    }

}

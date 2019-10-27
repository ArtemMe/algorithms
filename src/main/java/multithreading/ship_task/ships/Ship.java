package multithreading.ship_task.ships;

import multithreading.ship_task.ships.types.Size;
import multithreading.ship_task.ships.types.Type;

/**
 * Класс корабль
 * */

public class Ship {
    private int count;
    private Size size;
    private Type type;


    /**
     * Проверяет загружет ли корабль
     * */
    public boolean countCheck() {
        if(count >= size.getValue()) return false;
        return true;
    }

    /**
     * Занимаетмся погрузкой товара на корабль
     * */
    public void add(int count) {
        this.count += count;
    }

    public Ship(Size size, Type type) {
        this.size = size;
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

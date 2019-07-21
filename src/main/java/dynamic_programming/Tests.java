package dynamic_programming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    @Test
    public void test1() {
        BackPack bp = new BackPack();

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Гитара", 1L, 1500L));
        items.add(new Item("Магнитофон", 4L, 3000L));
        items.add(new Item("Ноутбук", 3L, 2000L));
        items.add(new Item("Iphone", 1L, 2000L));
        items.add(new Item("Ожерелье", 1L, 6000L));

        List<Item> result = bp.calculateOprimalItems(items,4);
        for(Item i : result)
            System.out.println(i.getName());
    }
}

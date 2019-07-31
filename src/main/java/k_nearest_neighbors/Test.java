package k_nearest_neighbors;

import java.util.ArrayList;
import java.util.List;

public class Test {

    /**
     * Массив обозначает метрику по жанрам
     *               Priyanka       Djastin        Morfius
     * комедия          3              4              2
     * боевик           4              3              5
     * драма            4              5              1
     * ужасы            1              1              3
     * мелодрама        4              5              1
     *
     * */

    @org.junit.Test
    public void valid(){
        List<User> users = new ArrayList<>();
        users.add(new User("Priyanka", new int[] {3, 4, 4, 1, 4}));
        users.add(new User("Djastin", new int[]  {4, 3, 5, 1, 5}));
        users.add(new User("Morfius", new int[]  {2, 5, 1, 3, 1}));

        Processor p = new Processor();
        String name = p.getNearestUser(0,users);
        System.out.println(name);
    }
}

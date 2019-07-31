package k_nearest_neighbors;


import java.util.HashMap;

public class User {
    private String name;
    private int[] metrics; //метрики по идее должны быть одинаковые для всех юзеров.
    private HashMap<String, Double> userDistance = new HashMap<>();

    public User(String name, int[] metrics) {
        this.name = name;
        this.metrics = metrics;
        this.userDistance = userDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMetrics() {
        return metrics;
    }

    public void setMetrics(int[] metrics) {
        this.metrics = metrics;
    }

    public HashMap<String, Double> getUserDistance() {
        return userDistance;
    }

    public void setUserDistance(HashMap<String, Double> userDistance) {
        this.userDistance = userDistance;
    }
}

package k_nearest_neighbors;

import java.util.List;
import java.util.Map;

public class Processor {
    public String getNearestUser(int num, List<User> users) {
        for(int i=0; i<users.size(); i++){
            User currentUser = users.get(i);
            for(int j=0; j<users.size(); j++){
                User other = users.get(j);
                if(!currentUser.getName().equals(other.getName())) {
                    double distance = calculateDistance(currentUser.getMetrics(), other.getMetrics());
                    currentUser.getUserDistance().put(other.getName(), distance);
                }
            }
        }

        return getNearest(users.get(num));
    }

    private double calculateDistance(int[] first, int[] second) {
        double sum = 0;
        for(int i=0; i < first.length; i++){
            float diff = first[i] - second[i];
            sum = sum + Math.pow(diff,2);
        }

        return getRoot(sum, 2.0);
    }

    private Double getRoot(Double base, Double n) {
        return Math.pow(Math.E, Math.log(base)/n);
    }

    private String getNearest(User user) {
        String name = "";
        Double minDist = Double.MAX_VALUE;
        for(Map.Entry<String, Double> e : user.getUserDistance().entrySet()){
            if(!e.getKey().equals(user.getName())) {
                if(e.getValue() < minDist) {
                    name = e.getKey();
                }
            }
        }
        return name;
    }
}

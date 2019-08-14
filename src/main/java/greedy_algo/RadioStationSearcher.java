package greedy_algo;

import java.util.*;

/**
 *  Имеется список станций.
 *  Каждая станция покрывает определенный набор штатов, эти наборы перекрываются.
 *  Как найти минимальный набор станций, который бы покрывал все 50 штатов?
 * */

public class RadioStationSearcher {
    public static List<String> findMinimalListStation(HashMap<String, HashSet<String>> stations, HashSet<String> states){

        HashSet<String> uncoveredState = new HashSet<>();
        List<String> result = new ArrayList<>();

        uncoveredState.addAll(states);

        String bestStation = null;
        int stationCounterCurrent = 0;
        int stationCounterMax = 0;

        while (!uncoveredState.isEmpty()) {
            for (Map.Entry<String, HashSet<String>> e : stations.entrySet()) {
                for (String ss : e.getValue()) {
                    if (uncoveredState.contains(ss)) {
                        stationCounterCurrent++;
                    }
                }

                if (stationCounterCurrent > stationCounterMax) {
                    bestStation = e.getKey();
                    stationCounterMax = stationCounterCurrent;
                }
                stationCounterCurrent = 0;
            }

            for(String s : stations.get(bestStation)) {
                uncoveredState.remove(s);
            }
            stationCounterMax = 0;
            stations.remove(bestStation);
            result.add(bestStation);
        }

        return result;
    }
}

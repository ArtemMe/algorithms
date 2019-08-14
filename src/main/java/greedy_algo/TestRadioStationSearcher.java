package greedy_algo;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * stations = {}
 * stations["kone"] set(["id", "nv", "ut"])
 * stations["ktwo"] set(["wa", "id", "mt"])
 * stations["kthree"] = set(["or", "nv", "са"])
 * stations["kfour"] set(["nv", "ut"])
 * stations["kfive"] = set(["ca", "az"])
 *
 * */
public class TestRadioStationSearcher {

    @Test
    public void testValid(){
        HashMap<String, HashSet<String>> stations = new HashMap<>();
        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "са")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        HashSet<String> states = new HashSet<>(Arrays.asList("id", "nv", "ut", "wa", "mt", "or", "ca", "az"));

        List<String> result = RadioStationSearcher.findMinimalListStation(stations, states);

        for (String s : result) {
            System.out.println(s);
        }
    }

}

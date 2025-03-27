import java.util.*;

public class CityPopulation {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();

        cityPopulation.put("New York", 8419600);
        cityPopulation.put("Los Angeles", 3980400);
        cityPopulation.put("Chicago", 2716000);

        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            System.out.println("City: " + entry.getKey() + ", Population: " + entry.getValue());
        }
    }
}

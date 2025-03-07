import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample
{


        public static void main(String[] args) {
            ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

            // Put elements
            map.put("Apple", 10);
            map.put("Banana", 20);

            // Get element
            System.out.println("Apple count: " + map.get("Apple"));

            // Concurrent update
            map.computeIfPresent("Apple", (key, value) -> value + 5);
            System.out.println("Updated Apple count: " + map.get("Apple"));

            // Iterating over the map (Safe for concurrent access)
            map.forEach((key, value) -> System.out.println(key + " -> " + value));
        }
    }



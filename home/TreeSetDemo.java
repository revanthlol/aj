import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Constructor
        TreeSet<String> cities = new TreeSet<>();

        // add()
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");

        System.out.println("TreeSet: " + cities);

        // remove()
        cities.remove("Delhi");
        System.out.println("After removing Delhi: " + cities);

        // contains()
        System.out.println("Contains Mumbai? " + cities.contains("Mumbai"));

        // removeAll()
        TreeSet<String> removeCities = new TreeSet<>();
        removeCities.add("Chennai");
        removeCities.add("Mumbai");

        cities.removeAll(removeCities);
        System.out.println("After removeAll(): " + cities);

        // clear()
        cities.clear();
        System.out.println("After clear(): " + cities);
    }
}

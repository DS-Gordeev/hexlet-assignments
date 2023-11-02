package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static List<String> buildApartmentsList(List<Home> apartments, int n) {

        List<String> result = new ArrayList<>();

        if(apartments.isEmpty()) return result;

        Collections.sort(apartments);
        for(Home obj: apartments) {
            result.add(obj.toString());
        }
        return result.subList(0, n);

    }
}

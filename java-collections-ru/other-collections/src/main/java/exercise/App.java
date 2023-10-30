package exercise;

import java.util.*;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {

        Set<String> union = new HashSet<>();
        union.addAll(data1.keySet());
        union.addAll(data2.keySet());

        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        for(String key : union) {
            if(!data1.containsKey(key) && data2.containsKey(key)) {
                result.put(key, "added");
            }
            if(data1.containsKey(key) && !data2.containsKey(key)) {
                result.put(key, "deleted");
            }
            if((data1.containsKey(key) && data2.containsKey(key)) && data1.get(key) != data2.get(key)) {
                result.put(key, "changed");
            }
            if((data1.containsKey(key) && data2.containsKey(key)) && data1.get(key) == data2.get(key)) {
                result.put(key, "unchanged");
            }

        }
        return result;
    }
}
//END

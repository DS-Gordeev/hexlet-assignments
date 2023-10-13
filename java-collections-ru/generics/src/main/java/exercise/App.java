package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> book) {

        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> bookFromShelf : books) {
            if (bookFromShelf.entrySet().containsAll(book.entrySet())) {
                result.add(bookFromShelf);
            }
        }
        return result;
    }
}
//END

package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
    public static boolean checkStrings(String email) {

        List<String> legalDomains = List.of("@gmail.com", "@yandex.ru", "@hotmail.com");

        for(String domain : legalDomains) {
            if(!domain.isEmpty() && email.contains(domain)) return true;
        }
        return false;
    }
    public static long getCountOfFreeEmails(List<String> listOfEmails) {

        return listOfEmails.stream()
                .filter(App::checkStrings)
                .count();
    }

}

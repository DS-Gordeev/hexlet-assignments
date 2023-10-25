package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

// BEGIN
public class App {

    public static void main(String[] args) {
        String testString = """
                [program:options]
                environment="X_FORWARDED_variable=value,  , key5=value5,X_FORWARDED_var3=value,key6=value6"

                key=value""";
        System.out.println(App.getForwardedVariables(testString));
    }

    public static String getForwardedVariables(String confFile) {
        List<String> confList = new ArrayList<>(Arrays.asList(confFile.split("\n")));
        return confList.stream()
                .filter(x -> x.startsWith("environment="))
                .map(x -> x.replaceAll("environment=", ""))
                .map(x -> x.replaceAll("\"", ""))
                .map(x -> x.split(","))
                .flatMap(Arrays::stream)
                .filter(kv -> kv.startsWith("X_FORWARDED_"))
                .map(kv -> kv.replaceFirst("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));

    }
}
//END

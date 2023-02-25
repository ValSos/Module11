import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class ThirdTask {

    public static String getArrayOfNumbers(String[] array){
        List<String> res = Stream.of(array)
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        return res.toString();


    }

}

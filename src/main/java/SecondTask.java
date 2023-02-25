import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public abstract class SecondTask {



    public static String sortName(List<String>names){
        Stream<String> nameStream = names
                .stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder());

        List<String> result = nameStream.collect(Collectors.toList());
        return result.toString();
    }

}

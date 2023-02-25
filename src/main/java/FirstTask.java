import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class FirstTask {

    public static String getNamesList(List<String> names){
        Stream<String> nameStream = names
                .stream()
                .filter(name -> names.indexOf(name)%2 != 0)
                .map(name -> names.indexOf(name) + ". " + name);

        List<String> result = nameStream.collect(Collectors.toList());
        return result.toString();
    }

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FifthTask {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> result = new ArrayList<>();
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        while (firstIterator.hasNext() && secondIterator.hasNext()){
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }
        return result.stream();
    }

}

import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class FourthTask {
    public static Stream<Long> lineGenerator(long a, long c, long m){
        //x[0] = seed
        //x[n + 1] = 1 (a x[n] + c) % m
        Stream<Long> stream = Stream.iterate(1L, x -> (1* (a * x + c) % m));
        stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
        return stream;
    }

}

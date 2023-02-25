import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //FirstTask
        List<String> nameList = List.of("Petro", "Valeriia", "Dmytro", "Olena");
        System.out.println(FirstTask.getNamesList(nameList));

        //SecondTask
        System.out.println(SecondTask.sortName(nameList));

        //ThirdTask
        String[] arr = {"1, 2, 0", "4, 5"};
        System.out.println(ThirdTask.getArrayOfNumbers(arr));

        //FourthTask
        FourthTask.lineGenerator(25214903917L, 11L, 2^48);

        //FifthTask
        Stream<Integer> firstForTest = Stream.of(1,2,3,4,5);
        Stream<Integer> secondForTest = Stream.of(6,7,8);
        System.out.println(FifthTask.zip(firstForTest, secondForTest).collect(Collectors.toList()));
    }
}

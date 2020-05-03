import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProsteDodawanie {

    public static int simpleAdd(Integer[] array){
        return Arrays.stream(array).mapToInt(Integer::intValue).sum();
    }

}

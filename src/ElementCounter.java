import java.util.HashMap;
import java.util.Map;

public class ElementCounter {


    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> elementCountMap = new HashMap<>();
        for (T element : array) {
            elementCountMap.merge(element,1,Integer::sum);
        }
        return elementCountMap;
    }
}

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 2, 1, 3, 4, 5, 4, 4, 0, 0, 0}; //Example


        Map<Integer, Integer> countMap = ElementCounter.countElements(numbers);

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Элемент: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}
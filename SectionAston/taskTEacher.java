import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Получить Map где ключ это число из списка + "-Hello", а значение то, сколько раз
 это число встречалось в списке, при этом убрать 4 и 6
        List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);*/
public class taskTEacher {



        public static void main(String[] args) {
            List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
            Map<String, Integer> resultMap = new HashMap<>();

            for (Integer number : integers) {

                if (number == 4 || number == 6) {
                    continue;
                }

                // Создаем ключ
                String key = number + "-Hello";


                resultMap.put(key, resultMap.getOrDefault(key, 0) + 1);
            }

            System.out.println(resultMap);
        }
    }


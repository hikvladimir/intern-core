import java.util.Arrays;

/*Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти
 по нему циклом, и числа меньшие 6 умножить на 2;*/
public class task2_3 {
    public static void main(String[] args) {
        int[] arr3={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]<6){
                arr3[i]=arr3[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}

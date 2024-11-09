import java.util.Arrays;

/* Задать пустой целочисленный массив размером 8.
 С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
public class task2_2 {
    public static void main(String[] args) {
        int[] arr2=new int[8];
        int j=0;
        for (int i = 0; i < arr2.length ; i++) {

            arr2[i]=j;
            j=j+3;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

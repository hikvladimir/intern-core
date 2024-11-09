import java.util.Arrays;

/*Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое) и с помощью цикла(-ов)
 заполнить его диагональные элементы единицами;*/
public class task2_4 {
    public static void main(String[] args) {
        int[][] arr4=new int[3][3];
        for (int i = 0; i < arr4.length ; i++) {
            for (int j = 0; j < arr4[i].length ; j++) {
                arr4[i][j]=0;
            }
        }
        for (int i = 0; i <arr4.length ; i++) {
            arr4[i][i]=1;
            arr4[i][arr4.length-i-1]=1;
        }
        for (int i = 0; i < arr4.length ; i++) {
            System.out.println();
            for (int j = 0; j < arr4[i].length ; j++) {
                System.out.print(arr4[i][j]+" ");
            }
        }
    }
}

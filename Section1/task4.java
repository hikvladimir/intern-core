/*Написать метод, которому в качестве параметра передается целое число,
 метод должен напечатать в консоль, положительное ли число передали или
  отрицательное. Замечание: ноль считаем положительным числом.*/
public class task4 {
    public static void main(String[] args) {
       outSign(-6);
    }

    static void outSign(int i){
        if (i>=0){
            System.out.println("положительно");
        }else {
            System.out.println("отрицательное");
        }
    }
}

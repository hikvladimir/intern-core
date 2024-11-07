/*4. Написать метод, принимающий на вход два целых числа и проверяющий,
 что их сумма лежит в пределах от 10 до 20 (включительно), если да - вернуть true,
  в противном случае - false.*/
public class task3 {
    public static void main(String[] args) {
        System.out.println(isSigment(10, 2));
    }
    static boolean isSigment(int a, int b){
        if (((a+b)<=20)&&((a+b)>=10)) {
            return true;
        }else {
            return false;
        }
    }
}

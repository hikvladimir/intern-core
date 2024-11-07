/* Написать метод, вычисляющий выражение а * (В + (с / 4) и возвращающий результат,
где а, 5, с, 9 — аргументы этого метода, имеющие тип float.*/
public class task2 {
    public static void main(String[] args) {
        System.out.println(expressionEvaluation(3.23F, 3.45F,1.23F));
    }
    static float expressionEvaluation(float a, float B, float c) {
        return a * (B + (c / 4));
    }
}

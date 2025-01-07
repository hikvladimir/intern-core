/*
Создайте класс, содержащий два поля типа int числитель и знаменатель обыкновенной дроби. • Конструктор класса должен инициализировать эти два поля.
• Создайте метод класса, который будет выводить дробь в текстовой строке
в формате х/у;
• Создайте метод, умножающий текущую дробь на число типа double,
 переданное методу в параметре и возвращающий дробь результат умножения;
• Создайте метод, делящий текущую дробь на число типа double,
переданное ему в параметре и
возвращающий дробь результат деления. */
public class Fraction {
    private int numerator;   // числитель
    private int denominator; // знаменатель

    // Конструктор класса
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Метод для вывода дроби в формате х/у
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод для умножения дроби на число типа double
    public Fraction multiply(double value) {
        int newNumerator = (int) (this.numerator * value);
        return new Fraction(newNumerator, this.denominator);
    }

    // Метод для деления дроби на число типа double
    public Fraction divide(double value) {
        if (value == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
        int newNumerator = this.numerator;
        int newDenominator = (int) (this.denominator * value);
        return new Fraction(newNumerator, newDenominator);
    }

    // Пример использования
    public static void main(String[] args) {
        Fraction fraction = new Fraction(3, 4);
        System.out.println("Исходная дробь: " + fraction);

        Fraction multiplied = fraction.multiply(2.5);
        System.out.println("После умножения на 2.5: " + multiplied);

        Fraction divided = fraction.divide(2.0);
        System.out.println("После деления на 2.0: " + divided);
    }
}


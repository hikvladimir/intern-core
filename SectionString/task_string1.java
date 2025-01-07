/*
Строки. Методы класса String
Напишите метод, который принимает в качестве параметра любую строку, например "I like Java!!!".
 1) Распечатать последний символ строки. Используем метод String.charAt().
 2) Проверить, заканчивается ли ваша строка подстрокой "!!!". Используем метод String.ends With().
 3) Проверить, начинается ли ваша строка подстрокой "I like". Используем метод String.starts With().
4) Проверить, содержит ли ваша строка подстроку "Java". Используем метод String.contains().
5) Найти позицию подстроки "Java" в строке "I like Java!!!".
6) Заменить все символы "а" на "о".
7) Преобразуйте строку к верхнему регистру.
8) Вырезать строку "Java" с помощью метода String.substring().*/
public class task_string1 {
    public static void main(String[] args) {
        String str="I like Java!!!";
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0, str.indexOf("Java") - 1) + str.substring(str.indexOf("Java") + "Java".length()));
    }
}

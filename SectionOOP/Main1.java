/*
Классы и объекты. Телефон.
Создайте класс Phone, который содержит поля number, model и weight
• Создайте три объекта (экземпляра) этого класса.
• Выведите в консоль значения полей объектов.
• Добавьте в класс Phone методы:
- receiveCall (один параметр имя звонящего). Выводит на консоль
 сообщение "Звонит (name".
- getNumber - возвращает номер телефона. Вызвать эти методы для каждого из объектов
• Добавить второй метод receiveCall, который принимает два параметра имя
 звонящего и номер телефона звонящего. Вызвать этот метод.
• Создать метод sendMessage с входным параметром массив номеров телефонов, которым
 надо отправить сообщение. Метод выводит на консоль номера этих телефонов.*/
public class Main1 {
    public static void main(String[] args) {
        // Создание объектов класса Phone
        Phon phone1 = new Phon("123456789", "Samsung", 150.5);
        Phon phone2 = new Phon("987654321", "iPhone", 140.2);
        Phon phone3 = new Phon("555666777", "Nokia", 120.0);

        // Вывод значений полей объектов
        System.out.println("Phone 1: номер = " + phone1.number + ", модель = " + phone1.model + ", вес = " + phone1.weight);
        System.out.println("Phone 2: номер = " + phone2.number + ", модель = " + phone2.model + ", вес = " + phone2.weight);
        System.out.println("Phone 3: номер = " + phone3.number + ", модель = " + phone3.model + ", вес = " + phone3.weight);

        // Вызов метода receiveCall с одним параметром
        phone1.receiveCall("Иван");
        phone2.receiveCall("Анна");
        phone3.receiveCall("Петр");

        // Вызов метода receiveCall с двумя параметрами
        phone1.receiveCall("Иван", "123456789");
        phone2.receiveCall("Анна", "987654321");
        phone3.receiveCall("Петр", "555666777");

        // Вызов метода sendMessage
        String[] phoneNumbers = {"123456789", "987654321", "555666777"};
        phone1.sendMessage(phoneNumbers);
    }
}

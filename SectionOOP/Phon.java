public class Phon {
    String number;
    String model;
    double weight;

    // Конструктор класса
    public Phon(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Метод для получения номера телефона
    public String getNumber() {
        return this.number;
    }

    // Метод для получения звонка с одним параметром (имя звонящего)
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Метод для получения звонка с двумя параметрами (имя и номер телефона звонящего)
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    // Метод для отправки сообщений нескольким номерам
    public void sendMessage(String[] numbers) {
        System.out.println("Сообщение отправляется на следующие номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
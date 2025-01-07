public class Main {
    public static void main(String[] args) {
        // Создание массива сотрудников
        Employee[] employees = new Employee[5];

        // Заполнение массива данными сотрудников
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 50000, 45);
        employees[2] = new Employee("Sidorov Sidor", "Developer", "sidorov@mailbox.com", "892312314", 60000, 50);
        employees[3] = new Employee("Mikhailov Mikhail", "Designer", "mikhailov@mailbox.com", "892312315", 45000, 35);
        employees[4] = new Employee("Alexandrov Alexander", "Director", "alexandrov@mailbox.com", "892312316", 80000, 55);

        // Цикл для вывода информации о сотрудниках старше 40 лет
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }
}

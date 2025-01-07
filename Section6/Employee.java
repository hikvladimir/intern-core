class Employee {
    // Поля класса
    private String fullName;  // ФИО
    private String position;   // Должность
    private String email;      // Email
    private String phone;      // Телефон
    private double salary;     // Зарплата
    private int age;           // Возраст

    // Конструктор класса
    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации о сотруднике
    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }
}



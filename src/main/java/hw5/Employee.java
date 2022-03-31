package hw5;

public class Employee {
    public String name;
    public String post;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);;
        System.out.println("Номер телефона: " + phoneNumber);;
        System.out.println("Зарплата: " + salary);;
        System.out.println("Возраст: " + age);;
        System.out.println();

    }
}




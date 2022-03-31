package hw5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employerOne = new Employee("Олег", "консультант", "оleg228@mail.ru", "79081233147", 10000, 54);
        Employee employerTwo = new Employee("Виталик", "программист", "vital33@mail.ru", "79511566288", 250000, 25);
        Employee employerThree = new Employee("Ольга", "продавец", "olga333@mail.ru", "79000994651", 25000, 41);
        Employee employerFour = new Employee("Максим", "фитнесс-тренер", "tcigan@yandex.ru", "79191617185", 70000, 34);
        Employee employerFive = new Employee("Михаил", "программист", "rafitat@gmail.com", "79038734619", 101000, 25);


        Employee[] employeesArr = new Employee[5];

        employeesArr[0] = employerOne;
        employeesArr[1] = employerTwo;
        employeesArr[2] = employerThree;
        employeesArr[3] = employerFour;
        employeesArr[4] = employerFive;


        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].age > 40) {
                employeesArr[i].printInfo();
            }
        }
    }
}


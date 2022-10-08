import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        Employee person1 = new Employee("Иванов", "Константин", "Ильич", 5, 35500.50);
        Employee person2 = new Employee("Рогожин", "Денис", "Александрович", 3, 40500.20);
        Employee person3 = new Employee("Калугина", "Елена", "Руслановна", 1, 41200.50);
        Employee person4 = new Employee("Павленко", "Ирина", "Леонидовна", 1, 37600.50);
        Employee person5 = new Employee("Лазарев", "Олег", "Николаевич", 2, 42600.50);
        Employee person6 = new Employee("Бирюкова", "Ирина", "Сергеевна", 4, 40000.00);
        Employee person7 = new Employee("Иванов", "Иван", "Иванович", 2, 29800.00);
        Employee person8 = new Employee("Симонова", "Ольга", "Владимировна", 5, 39800.50);
        Employee person9 = new Employee("Емелин", "Артем", "Егорович", 3, 45500.50);
        Employee person10 = new Employee("Евстигнеев", "Никита", "Алексеевич", 4, 40800.00);
        Employee[] employees = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};

        System.out.println(person1 + "\n" + person2 + '\n' + person3 + '\n' + person4 +
                '\n' + person5 + '\n' + person6 + '\n' + person7 + "\n" + person8 + '\n' + person9 + '\n' + person10);

        // Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("Сумма затрат на зарплаты в месяц - " + getAllSalary(employees));
        // Найти сотрудника с минимальной зарплатой.
        System.out.println("Сотрудник с минимальной зарплатой - " + getEmployeeWithMinSalary(employees));
        //Найти сотрудника с максимальной зарплатой.
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeWithMaxSalary(employees));
        //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        System.out.println("Среднее значение зарплат - " + getMiddleSalary(employees));
        // Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.println("ФИО всех сотрудников - " + (Arrays.toString(getFullName(employees))));

    }

    // Посчитать сумму затрат на зарплаты в месяц.
    public static double getAllSalary(Employee[] employees) {
        double resultSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                resultSum += employees[i].getSalary();

        }
        return resultSum;
    }

    // Найти сотрудника с минимальной зарплатой.
    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    // Найти сотрудника с максимальной зарплатой.
    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public static double getMiddleSalary(Employee[] employees) {
        return getAllSalary(employees) / employees.length;
    }

    // Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static String[] getFullName(Employee[] employees) {
        String[] fullName = new String[10];
        for (int i = 0; i < employees.length; i++) {
            fullName[i] = employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic();
        }
        return fullName;
    }
}










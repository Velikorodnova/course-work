public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        employees[0] = new Employee("Иванов", "Константин", "Ильич", 5, 35500.50);
        employees[1] = new Employee("Рогожин", "Денис", "Александрович", 3, 40500.20);
        employees[2] = new Employee("Калугина", "Елена", "Руслановна", 1, 41200.50);
        employees[3] = new Employee("Павленко", "Ирина", "Леонидовна", 1, 37600.50);
        employees[4] = new Employee("Лазарев", "Олег", "Николаевич", 2, 42600.50);
        employees[5] = new Employee("Бирюкова", "Ирина", "Сергеевна", 4, 40000.00);
        employees[6] = new Employee("Иванов", "Иван", "Иванович", 2, 29800.00);
        employees[7] = new Employee("Симонова", "Ольга", "Владимировна", 5, 39800.50);
        employees[8] = new Employee("Емелин", "Артем", "Егорович", 3, 45500.50);
        employees[9] = new Employee("Евстигнеев", "Никита", "Алексеевич", 4, 40800.00);

        // Получить список всех сотрудников со всеми имеющимися по ним данными
        getAllEmployees();
        // Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("Сумма затрат на зарплаты в месяц - " + getAllSalary());
        // Найти сотрудника с минимальной зарплатой.
        System.out.println("Сотрудник с минимальной зарплатой - " + getEmployeeWithMinSalary());
        //Найти сотрудника с максимальной зарплатой.
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeWithMaxSalary());
        //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        System.out.println("Среднее значение зарплат - " + getMiddleSalary());
        // Получить Ф. И. О. всех сотрудников (вывести в консоль).
        getFullName();
    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными
    private static void getAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц.
    private static double getAllSalary() {
        double resultSum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                resultSum += employee.getSalary();
            }
        }
        return resultSum;
    }

    // Найти сотрудника с минимальной зарплатой.
    private static Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees != null) {
                if (employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = employees[i];
                }
            }
        }
        return employeeWithMinSalary;
    }

    // Найти сотрудника с максимальной зарплатой.
    private static Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees != null) {
                if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = employees[i];
                }
            }
        }
        return employeeWithMaxSalary;
    }

    // Получить Ф. И. О. всех сотрудников (вывести в консоль).

    private static String getFullName() {
        String fullName = " ";
        for (Employee employee : employees) {
            if (employees != null) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
            }
        }
        return fullName;
    }

    // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    private static double getMiddleSalary() {
        int tmp = 0;
        double allSum = getAllSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                tmp++;
            }
        }
        return allSum/tmp;
    }
}
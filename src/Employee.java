public class Employee {

    private int id;
    private static int idCounter = 0;
    private final String surname;
    private final String name;
    private final String patronymic;
    private int departmentNumber;
    private double salary;


    public Employee(String surname, String name, String patronymic, int departmentNumber, double salary) {
        this.id = ++idCounter;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Фамилия: " + surname + " Имя: " + name + " Отчество: " + " Отдел: " + departmentNumber + " Зарплата: " + salary + " ID." + id;
    }


}



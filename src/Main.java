import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 1, 60000);
        employees[1] = new Employee("Петрова Надежда Александровна", 2, 82000);
        employees[2] = new Employee("Суслов Сергей Васильевич", 3, 68000);
        employees[3] = new Employee("Власенко Александр Александрович", 4, 92000);
        employees[4] = new Employee("Зайцев Сергей Семенович", 5, 78000);
        employees[5] = new Employee("Каюмов Марат Саидович", 2, 58000);
        employees[6] = new Employee("Потапенко Ксения Владимировна", 3, 62000);
        employees[7] = new Employee("Семеняго Григорий Петрович", 5, 81000);
        employees[8] = new Employee("Алексеев Сергей Валерьевич", 1, 90000);
        employees[9] = new Employee("Стальнова Светлана Евгеньевна", 4, 65000);

        allEmployees(employees);

        int totalSalary = calculateSalary(employees);
        System.out.println("Общая сумма затрат на зарплату: " + totalSalary + "р.");

        Employee minSalaryEmployee = findMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);

        Employee maxSalaryEmployee = findMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);

        int averageSalary = calculateAverageSalary(employees);
        System.out.println("Средняя зарплата: " + averageSalary + "р.");

        printEmployeesNames(employees);
    }
    public static void allEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }
    public static int calculateSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary;
    }
    public static Employee findMinSalary(Employee[] employees) {
        Employee minSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == null || employees[i].getSalary() < minSalary.getSalary()) {
                minSalary = employees[i];
            }
        }
        return minSalary;
    }
    public static Employee findMaxSalary(Employee[] employees) {
        Employee maxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == null || employees[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }
    public static int calculateAverageSalary(Employee[] employees) {
        int total = calculateSalary(employees);
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }
    public static void printEmployeesNames(Employee[] employees) {
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

}
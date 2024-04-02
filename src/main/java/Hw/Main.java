package Hw;

public class Main {
    private static Employee[] employees = new Employee[10];

    static void inicial() {
        employees[0] = new Employee("Бадмаев Бадма Бадмаевич 1", 10_000, 1);
        employees[1] = new Employee("Бадмаев Бадма Бадмаевич 2", 20_000, 2);
        employees[2] = new Employee("Бадмаев Бадма Бадмаевич 3", 30_000, 1);
        employees[3] = new Employee("Бадмаев Бадма Бадмаевич 4", 25_000, 4);
        employees[4] = new Employee("Бадмаев Бадма Бадмаевич 5", 40_000, 1);
        employees[5] = new Employee("Бадмаев Бадма Бадмаевич 6", 50_000, 5);
        employees[6] = new Employee("Бадмаев Бадма Бадмаевич 7", 40_000, 4);
        employees[7] = new Employee("Бадмаев Бадма Бадмаевич 8", 30_000, 3);
        employees[8] = new Employee("Бадмаев Бадма Бадмаевич 9", 45_000, 2);
        employees[9] = new Employee("Бадмаев Бадма Бадмаевич 10", 35_000, 4);
    }

    public static void main(String[] args) {
        inicial();
        printEmployee();
        printMinSalaryEmployee();
        printMaxSalaryEmployee();
        System.out.println("сумму затрат на ЗП в месяц=" + getSalarySum());
        printAvarageSalaryEmployee();
        printEmploeesFullName();
    }

    private static void printEmployee() {
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);
    }

    private static int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryOfEmployee();
        }
        return sum;
    }

    private static void printMinSalaryEmployee() {
        int minSalaryEmployee = employees[0].getSalaryOfEmployee();
        String personMinSalary = employees[0].getFullNameOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() < minSalaryEmployee) {
                minSalaryEmployee = employees[i].getSalaryOfEmployee();
                personMinSalary = employees[i].getFullNameOfEmployee();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника " + personMinSalary + " и составляет " + minSalaryEmployee);
    }

    private static void printMaxSalaryEmployee() {
        int maxSalaryEmployee = employees[0].getSalaryOfEmployee();
        String personMaxSalary = employees[0].getFullNameOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() > maxSalaryEmployee) {
                maxSalaryEmployee = employees[i].getSalaryOfEmployee();
                personMaxSalary = employees[i].getFullNameOfEmployee();
            }
        }
        System.out.println("Максимальная  зарплата у сотрудника " + personMaxSalary + " и составляет " + maxSalaryEmployee);
    }
    private static void printEmploeesFullName() {
        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника=>" + employee.getFullNameOfEmployee());
        }
    }
    private static void printAvarageSalaryEmployee() {
        System.out.println("среднее значение зарплат=" + (double) (getSalarySum() / employees.length));
    }
}

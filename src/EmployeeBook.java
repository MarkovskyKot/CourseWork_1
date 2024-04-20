public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    //Вывод в консоль всех данных всех сотрудников

    public void printNameEmployees() {

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getPersons());
            }
        }
    }
    //Вывод в консоль имён сотрудников

    public int calcSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }
    //Вычисление суммы затрат на выплаты сотрудникам

    public void printSumSalary() {
        System.out.println("Сумма трат за месяц составила " + calcSumSalary() + " рублей");
    }
    //Вывод в консоль суммы затрат

    public double calcMeanSalary() {
        int divider = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                divider++;
            }
        }
        return ((double) calcSumSalary() / divider);
    }
    //Вычисление средней зарплаты

    public void printMeanSalary() {
        System.out.println("Среднее значение зарплат - " + (int) calcMeanSalary() + " рублей");
    }
    //Вывод в консоль средней зарплаты

    public Employee findEmployeeMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee employees1 = employees[0];
        for (Employee employee : employees) {
            if (employee != null && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employees1 = employee;
            }
        }
        return employees1;
    }
    //Поиск сотрудника минимальной зарплатой

    public void printEmpMinSal() {
        System.out.println("Сотрудник с минимальной зарплатой в " + findEmployeeMinSalary().getSalary()
                + " рублей - " + findEmployeeMinSalary().getPersons());
    }
    //Вывод в консоль сотрудника с минимальной зарплатой

    public Employee findEmployeeMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee employees1 = employees[0];
        for (Employee employee : employees) {
            if (employee != null && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employees1 = employee;
            }
        }
        return employees1;
    }
    //Поиск сотрудника максимальной зарплатой

    public void printEmpMaxSal() {
        System.out.println("Сотрудник с максимальной зарплатой в " + findEmployeeMaxSalary().getSalary()
                + " рублей - " + findEmployeeMaxSalary().getPersons());
    }
    //Вывод в консоль сотрудника с максимальной зарплатой

    public void increaseSalary(int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary((int) (employee.getSalary() * (percent / 100f + 1)));
            }
        }
    }
    //Индексируем зп всем сотрудникам

    public Employee findEmployeeMinSalaryInGroup(int group) {
        int minSalary = Integer.MAX_VALUE;
        Employee employees1 = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getGroup() == group && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employees1 = employee;
            }
        }
        return employees1;
    }
    //Поиск сотрудника минимальной зарплатой в отделе

    public void printEmpMinSalInGroup(int group) {
        System.out.println("Сотрудник с минимальной зарплатой в отделе №" + group + " - " + findEmployeeMinSalaryInGroup(group).getPersons()
                + " (" + findEmployeeMinSalaryInGroup(group).getSalary() + " рублей)");
    }
    //Вывод в консоль сотрудника с минимальной зарплатой в отделе

    public Employee findEmployeeMaxSalaryInGroup(int group) {
        int maxSalary = Integer.MIN_VALUE;
        Employee employees1 = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getGroup() == group && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employees1 = employee;
            }
        }
        return employees1;
    }
    //Поиск сотрудника максимальной зарплатой в отделе

    public void printEmpMaxSalInGroup(int group) {
        System.out.println("Сотрудник с максимальной зарплатой в отделе №" + group + " - " + findEmployeeMaxSalaryInGroup(group).getPersons()
                + " (" + findEmployeeMaxSalaryInGroup(group).getSalary() + " рублей)");
    }
    //Вывод в консоль сотрудника с максимальной зарплатой в отделе

    public int calcSumSalaryInGroup(int group) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getGroup() == group) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }
    //Вычисление суммы затрат на выплаты сотрудникам в отделе

    public void printSumSalaryInGroup(int group) {
        System.out.println("Сумма трат за месяц в отделе №" + group + " составила " + calcSumSalaryInGroup(group) + " рублей");
    }
    //Вывод в консоль суммы затрат в отделе

    public double calcMeanSalaryInGroup(int group) {
        int divider = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getGroup() == group) {
                divider++;
            }
        }
        return ((double) calcSumSalaryInGroup(group) / divider);
    }
    //Вычисление средней зарплаты в отделе

    public void printMeanSalaryInGroup(int group) {
        System.out.println("Среднее значение зарплат в отделе №" + group + " - " + (int) calcMeanSalaryInGroup(group) + " рублей");
    }
    //Вывод в консоль средней зарплаты в отделе

    public void increaseSalaryInGroup(int group, int percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getGroup() == group) {
                employee.setSalary((int) (employee.getSalary() * (percent / 100f + 1)));
            }
        }
    }
    //Индексируем зп сотрудникам в отделе

    public void printEmployeesInGroup(int group) {
        for (Employee employee : employees) {
            if (employee != null && employee.getGroup() == group) {
                System.out.println("Id " + employee.getId() + ". " + employee.getPersons() + ", зарплата - " + employee.getSalary() + " рублей");
            }
        }
    }
    //Выводим в консоль данные сотрудников отдела

    public void printEmployeesSalaryLessThan(int value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < value) {
                System.out.println(employee);
            }
        }
    }
    //Выводим в консоль данные сотрудников с зарплатой меньше указанного числа

    public void printEmployeesSalaryMoreThan(int value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= value) {
                System.out.println(employee);
            }
        }
    }
    //Выводим в консоль данные сотрудников с зарплатой больше указанного числа

    public void addEmployee(Persons persons, int salary, int group) {
        boolean placeForEmployeeIsEmpty = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                placeForEmployeeIsEmpty = true;
                employees[i] = new Employee(persons, salary, group);
                System.out.println("Сотрудник успешно добавлен");
                break;
            }
        }
        if (!placeForEmployeeIsEmpty) {
            System.out.println("Нет места для нового сотрудника");
        }
    }
    //Добавляем нового сотрудника

    public void findEmployeeFromId(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                System.out.println(employee.getPersons() + ". Отдел №" + employee.getGroup());
            }
        }
    }
    //Находим сотрудника по id

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                System.out.println("Сотрудник " + employees[i].getPersons() + " удалён");
                employees[i] = null;
            }
        }
    }
    //Удаляем сотрудника с указанным id
}
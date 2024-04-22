import java.util.Objects;

public class Employee {
    private final Persons persons;
    private int salary;
    private int group;
    private int id;
    private static int counter;

    public void counter() {
        counter++;
        this.id = getCounter();
    }

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public Employee(Persons persons, int salary, int group) {
        this.persons = persons;
        this.salary = salary;
        this.group = group;
        counter();
    }

    public Persons getPersons() {
        return persons;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Id " + id + ". " + persons.toString() + "; отдел №" + group + "; зарплата " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && group == employee.group && id == employee.id && Objects.equals(persons, employee.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persons, salary, group, id);
    }
}
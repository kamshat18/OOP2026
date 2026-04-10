package task_4;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee> {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;
    public Employee(String name,double salary,Date hireDate,String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }
    public double getSalary() {
        return salary;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public String toString() {
        return "Employee: " + name +
               " salary=" + salary +
               " hireDate=" + hireDate +
               " insurance=" + insuranceNumber;
    }
    public boolean equals(Object obj) {

        if (!super.equals(obj))
            return false;

        Employee other = (Employee) obj;

        return salary == other.salary &&
               insuranceNumber.equals(other.insuranceNumber);
    }

    public int compareTo(Employee other) {

        if (salary > other.salary)
            return 1;

        if (salary < other.salary)
            return -1;

        return 0;
    }

    public Object clone() throws CloneNotSupportedException {

        Employee cloned = (Employee) super.clone();

        cloned.hireDate = (Date) hireDate.clone();

        return cloned;
    }
}
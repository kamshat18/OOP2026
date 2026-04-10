package task_4;

import java.util.Vector;
import java.util.Date;
class Manager extends Employee {

    private Vector<Employee> team;

    private double bonus;

    public Manager(String name,
                   double salary,
                   Date hireDate,
                   String insuranceNumber,
                   double bonus) {

        super(name, salary, hireDate, insuranceNumber);

        this.bonus = bonus;

        team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public double getBonus() {
        return bonus;
    }

    public String toString() {
        return super.toString() +
               " bonus=" + bonus +
               " team size=" + team.size();
    }

    public boolean equals(Object obj) {

        if (!super.equals(obj))
            return false;

        Manager other = (Manager) obj;

        return bonus == other.bonus;
    }

    public int compareTo(Employee other) {

        int result = super.compareTo(other);

        if (result == 0 && other instanceof Manager) {

            Manager m = (Manager) other;

            if (bonus > m.bonus)
                return 1;

            if (bonus < m.bonus)
                return -1;
        }

        return result;
    }

    public Object clone() throws CloneNotSupportedException {

        Manager cloned = (Manager) super.clone();

        cloned.team = new Vector<>(team);

        return cloned;
    }
}
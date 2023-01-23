import java.util.Calendar;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void CalculateTheTotalSalary() {
        double salary = this.salary;
        salary = salary - Tax(this.salary);
        if (Bonus(workHours) != 0) {
            salary = salary + Bonus(workHours);
        }


        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hour: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + Tax(this.salary));
        System.out.println("Bonus: " + Bonus(this.workHours));
        System.out.println("Salary Increase: " + RaiseSalary(hireYear)*this.salary );
        System.out.println("Salary with Taxes and Bonus: " + salary);
        System.out.println("Total salary: " + (this.salary+this.salary*RaiseSalary(hireYear)));
    }
    double Tax(double salary) {
        if (salary < 1000) {
            return 0;
        }
        return salary * 0.03;
    }
    double Bonus(int workHours) {
        if (workHours < 40) {
            return 0;
        }
        return 30 * (workHours-40);
    }

    double RaiseSalary(int hireYear) {
        double zam;
        if (2021 - hireYear < 10) {
            return 0.05;
        } else if ((2021 - hireYear) < 20) {
            return 0.1;
        } else {
            return 0.15;
        }
    }


}

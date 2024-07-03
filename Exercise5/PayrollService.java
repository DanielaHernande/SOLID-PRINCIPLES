package Exercise5;

public class PayrollService {

    public void calculatePay(Employee employee) {

        double salary = employee.getSalary();
        System.out.println("Calculating pay for " + employee.getName() + ": $" + salary);
    }
}

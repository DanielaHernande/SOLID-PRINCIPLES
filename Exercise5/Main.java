package Exercise5;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Cindy Nero", 30000.0);

        PayrollService payrollService = new PayrollService();
        payrollService.calculatePay(employee);

        EmployeeReport employeeReport = new EmployeeReport();
        employeeReport.generateReport(employee);

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.saveToDatabase(employee);
    }
}

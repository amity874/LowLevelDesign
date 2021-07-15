package SolidDesignPrinciple.com.SRP;
public class EmployeeHandler {
    public static void main(String[] args) {
        EmployeeRefactor employee = new EmployeeRefactor(1, "Amit", "25 June 2021",2000000);
        EmployeeHiring employeeHiring = new EmployeeHiring();
        employeeHiring.Hiremployee(employee);
        SalaryCalculator s=new SalaryCalculator();
        s.CalculateSalary(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getDoj());
        System.out.println(employee.getId());
        System.out.println(employee.getSalary());

    }
}

package org.allyourcode.company;

public class Main {

  public static void main(String[] args) {
    Employee employee = 
        new Employee("Barry", "Author");

    FullTimeEmployee ftEmployee = 
        new FullTimeEmployee("Ed", "Manager", 10000.00);

    PartTimeEmployee ptEmployee = 
        new PartTimeEmployee("Joe", "Intern", 8.00, 20);

    Executive executive = 
        new Executive("Jane", "CEO", 20000.00, 5000.00);

    employee.showPay();
    ftEmployee.showPay();
    ptEmployee.showPay();
    executive.showPay();
  }

}

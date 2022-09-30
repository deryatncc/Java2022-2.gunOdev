import Inheritance.Customer;
import Inheritance.CustomerManager;
import Inheritance.Employee;
import Inheritance.EmployeeManager;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.setAge(25);
		customer.setEmail(" asdasd@sldas.com ");
		customer.setFirstName(" Deniz ");
		customer.setLastName(" tanc ");
		customer.setId(123);

		employee.setAge(32);
		employee.setFirstName(" Derin ");
		employee.setLastName(" Turunc ");
		employee.setId( 156 );
		employee.setSalary( 8500 );

		CustomerManager customerManager = new CustomerManager();
		customerManager.Add(customer);
		
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.Add(employee);
		employeeManager.BestEmployee();
	}

}

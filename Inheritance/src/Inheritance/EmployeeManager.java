package Inheritance;

public class EmployeeManager  {
	public void Add(Employee employee) {
		System.out.println("Calısan\n " + "Adı: " + employee.getFirstName() + "Soyadı: " + employee.getLastName()
				+ "Yası: " + employee.getAge() + " Maasi: " + employee.getSalary() + "Id: " + employee.getId());
	}

	public void BestEmployee() {
		System.out.println("Ayin elemani secildi");
	}

}

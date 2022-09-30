package Inheritance;

public class CustomerManager  {
	public void Add(Customer customer) {
		System.out.println(
				"Musteri bilgileri\n " + "Adı: " + customer.getFirstName() + "Soyadı: " + customer.getLastName()
						+ "Yası: " + customer.getAge() + " Mail: " + customer.getEmail() + "Id: " + customer.getId());
	}

}

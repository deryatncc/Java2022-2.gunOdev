
public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade orani";
		Product product1 = new Product();
		product1.setName("kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setImageUrl("bilmemne.jpg");
		product1.setUnitsInStock(5);
		Product product2 = new Product();
		product2.setName("telefon");
		product2.setDiscount(10);
		product2.setUnitPrice(9500);
		product2.setImageUrl("bilmemnee.jpg");
		product2.setUnitsInStock(120);

		Product product3 = new Product();
		product3.setName("ütü");
		product3.setDiscount(15);
		product3.setUnitPrice(3500);
		product3.setImageUrl("bilmemneee.jpg");
		product3.setUnitsInStock(10);

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(6);
		individualCustomer.setCustomerNumber("6754");
		individualCustomer.setPhone("9389493894");
		individualCustomer.setFirstName("deniz");
		individualCustomer.setLastName("tanc");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Tncc");
		corporateCustomer.setCustomerNumber("56553663");
		corporateCustomer.setId(27367);
		corporateCustomer.setPhone("058237784");
		corporateCustomer.setTaxNumber("727637");
		
		Customer[] customers= {individualCustomer,corporateCustomer};
		
	}

}

package classes_field;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("HOMEND ");
		product.setDescription("Kahve Makinesi");
		product.setPrice(999);
		product.setStockAmount(5);
	productManager productManager = new productManager();
	productManager.Add(product);
		
	}

}

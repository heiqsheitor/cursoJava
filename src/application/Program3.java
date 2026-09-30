package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Product product = new Product(); - esse construtor padrão não existe mais por que ele não está mais definido, pois agora tem um construtor com argumentos.

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price); // agora é obrigado a informar os dados do produto no momento da
													// instanciação dele
		
		// --------------

		product.setName("Computer"); // chamando o método setName e passando o novo valor do argumento
		System.out.println("Update name: " + product.getName());
		
		product.setPrice(1200.00); // adicionar um valor novo
		System.out.println("Update price: " + product.getPrice()); // acessar o valor

		// --------------

		System.out.println();
		System.out.print("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + product);

		sc.close();
	}
}
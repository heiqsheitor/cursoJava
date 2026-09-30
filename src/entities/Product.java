package entities;

public class Product {
	// atributos da classe Product
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) { // construtor com argumentos
		// para atribuir o parâmetro ao atributo do objeto, utiliza-se "this"
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) { // construtor 2 (sem o argumento do quantidade)
		this.name = name;
		this.price = price;
//    	this.quantity = 0; // é opcional, pois o valor já vai começar com zero
	}

	// --------------

	// métodos getters e setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity; // somente para retornar o valor de quantidade
	}
	
	// não utilizar o setQuantity nesse caso, pois o valor de quantidade só muda durante entrada ou saída

	// --------------

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
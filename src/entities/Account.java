package entities;

public class Account {
	private int number;
	private String holder; // holder = titular
	private double balance;

	// construtor 1 com 2 argumentos
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// construtor 2 com 3 argumentos
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // chamando a operação de depósito passando o valor initialDeposit como
									// argumento (pois se no futuro, a regra de negócio do banco for mudar, vai ser
									// necessário mudar a operação de negócio)
	}

	public int getNumber() {
		return number; // número da conta não pode ser alterado
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance; // saldo da conta só pode ser alterado por meio de saque ou depósito
	}

	public void deposit(double amount) { // amount = quantia, deposit = depósito
		balance += amount;
	}

	public void withdraw(double amount) { // withdraw = sacar
		balance -= amount + 5.0;
	}
	
	public String toString() { // toString para definir como os dados da conta vão ser exibidos
		return "Account "
				+ number
				+ ", Holder"
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
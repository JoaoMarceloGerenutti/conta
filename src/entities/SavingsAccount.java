package entities;

public class SavingsAccount extends Account {

	private Double taxaJuro;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer numero, String titular, Double saldo, Double taxaJuro) {
		super(numero, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	public void atualizadaSaldo() {
		saldo += saldo * taxaJuro;
	}
}

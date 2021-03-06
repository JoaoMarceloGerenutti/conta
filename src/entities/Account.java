package entities;

public abstract class Account {

	private Integer numero;
	private String titular;
	protected Double saldo;
	
	public Account() {
	}

	public Account(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
	}
}

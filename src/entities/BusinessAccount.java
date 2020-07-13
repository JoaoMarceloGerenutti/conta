package entities;

public class BusinessAccount extends Account {
	
	private Double limiteEmprestimo;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double quantidade) {
		if (quantidade <= limiteEmprestimo) {
			saldo += quantidade - 10.0;
		}
	}
	
	@Override
	public void saque(double quantidade) {
		super.saque(quantidade);
		saldo -= 2.0;
	}
	
}

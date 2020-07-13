package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Account> lista = new ArrayList<>();

		lista.add(new SavingsAccount(1001, "Alex", 500.00, 0.01)); 
		lista.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		lista.add(new SavingsAccount(1003, "Bob", 300.00, 0.01)); 
		lista.add(new BusinessAccount(1004, "Ana", 500.00, 500.00));
		
		double soma = 0.0;
		for (Account account : lista) {
			soma += account.getSaldo();
		}
		
		System.out.printf("Saldo total: %.2f%n", soma);
		
		for (Account account : lista) {
			account.deposito(10.0);
		}
		
		for (Account account : lista) {
			System.out.printf("Saldo atualizado da conta %d: $ %.2f%n", account.getNumero(), account.getSaldo());
		}
	}
}

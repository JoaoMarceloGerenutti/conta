package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 1000.0);
		acc.saque(200.0);
		System.out.println(acc.getSaldo());
		
		Account sacc = new SavingsAccount(1005, "João", 1000.0, 0.01);
		sacc.saque(200.0);
		System.out.println(sacc.getSaldo());
		
		Account bacc1 = new BusinessAccount(1006, "Julia", 1000.0, 500.0);
		bacc1.saque(200.0);
		System.out.println(bacc1.getSaldo());
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.emprestimo(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; modo errado
		
		//Da falso
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		//Da verdadeiro
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.atualizadaSaldo();
			System.out.println("Atualizado!");
		}
	}

}

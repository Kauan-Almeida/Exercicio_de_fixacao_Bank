package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String yes = "y";
		String no = "n";
		String a = "";
			
		System.out.print("Is there na initial deposit (y/n)? ");
		a = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		if ( a.equals(yes)) {
		System.out.print("Enter initial deposit value:" );
		double deposito = sc.nextDouble();
		Bank x = new Bank(number, holder, deposito);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account " + x);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		x.deposito2(deposito);
		
		System.out.println("Updated account data: ");
		System.out.println("Account " + x);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		x.saque(saque);
		
		System.out.println("Updated account data: ");
		System.out.println("Account " + x);
		}
		
		else if (a.equals(no)){
			
			Bank x = new Bank(number, holder);
			
			System.out.println();
			System.out.println("Account data: ");
			System.out.println("Account " + x);
			
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double deposito = sc.nextDouble();
			x.deposito2(deposito);
			Bank x1 = new Bank(number, holder, deposito);
			
			System.out.println("Updated account data: ");
			System.out.println("Account " + x1);
			
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double saque = sc.nextDouble();
			x1.saque(saque);
			
			System.out.println("Updated account data: ");
			System.out.println("Account " + x1);
			
		}
		
		sc.close();
	}
}
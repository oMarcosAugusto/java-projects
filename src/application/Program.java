package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of taxpayers: ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Taxpayer #" + i + " data:");
			System.out.println("Inididual or Company (I/C)? ");
			char type = sc.next().toUpperCase().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(type == 'I') {
				System.out.println("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
			//	Individual id = new Individual(name, anualIncome, healthExpenditures);
			//	list.add(id);
				list.add(new Individual(name, anualIncome, healthExpenditures));			
		}else {
			System.out.println("Number os employess: ");
			Integer numberOfEmployees = sc.nextInt();
			list.add(new Company(name, anualIncome,numberOfEmployees ));
			}			
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		System.out.println();
		double sum =0.0;
		for(TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}
	
}

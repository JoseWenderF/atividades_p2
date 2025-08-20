import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int cont = entrada.nextInt();
		ArrayList<pessoa> listaPessoas = new ArrayList<>();

		String tipo;
		String name;
		double anualIncome;
		int employees;
		double healthExpenditures;
        double total = 0.0;
		
		
		for (int i = 0; i < cont; i++){
            System.out.print("\nTax payer #" + (i+1) + " data:\n");
		    System.out.print("Indivisual or company (i/c)? ");
		    tipo = entrada.next();
		    if (tipo.equals("i")){
		        System.out.print("Name: ");
		        name = entrada.next();
		        System.out.print("Anual income: ");
		        anualIncome = entrada.nextDouble();
		        System.out.print("Health expenditures: ");
		        healthExpenditures = entrada.nextDouble();
		        
		        pessoa novaPessoa = new pessoaFisica(name, anualIncome, healthExpenditures);

                listaPessoas.add(novaPessoa);
		    }
            else{
                System.out.print("Name: ");
		        name = entrada.next();
		        System.out.print("Anual income: ");
		        anualIncome = entrada.nextDouble();
		        System.out.print("Number of employees: ");
		        employees = entrada.nextInt();
		        
		        pessoa novaPessoa = new pessoaJuridica(name, anualIncome, employees);

                listaPessoas.add(novaPessoa);
            }
		    System.out.print("\n");
		}

        System.out.print("\nTaxes Paid:\n");
        pessoa p;
        for (int i = 0; i < cont; i++){
            p = listaPessoas.get(i);
            if (p instanceof pessoaFisica){
                pessoaFisica pf = (pessoaFisica) p;
                System.out.printf("%s: $ %.2f%n", pf.getName(), pf.tax());
                total = total + pf.tax();
            } else{
                pessoaJuridica pj = (pessoaJuridica) p;
                System.out.printf("%s: $ %.2f%n", pj.getName(), pj.tax());
                total = total + pj.tax();
            }
        }
		
        System.out.printf("\nTotal Taxes: $ %.2f%n", total);

        entrada.close();
	}
}

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Enter account data\n");
        System.out.print("Number: ");
        int number = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Holder: ");
        String holder = entrada.nextLine();
        System.out.print("Initial balance: ");
        double balance = entrada.nextDouble();
		System.out.print("Withdraw limit: ");
        double limit = entrada.nextDouble();

        account conta = new account(number, holder, balance, limit);

        System.out.printf("\nEnter amount for withdraw: ");
        double amount = entrada.nextDouble();

        try{
            conta.withdraw(amount);
        }catch(erroSaqueMaiorLimite e){
            System.out.printf("Withdraw error: " + e.getMessage());
		    System.exit(1);
        }catch(erroSaqueMaiorSaldo e){
            System.out.printf("Withdraw error: " + e.getMessage());
		    System.exit(1);
        }

        System.out.printf("New balance: %.2f", conta.getBalance());
		
        entrada.close();
	}
}

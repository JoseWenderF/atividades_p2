import java.util.Scanner;
import java.time.LocalDate;

public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Room number: ");
		int room = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		String entCheckIn = entrada.nextLine();
		System.out.print("Check-out date (dd/MM/yyyy): ");
		String entCheckOut = entrada.nextLine();
		
		reserva teste = null;
		try {
		    teste = new reserva(room, entCheckIn, entCheckOut);    
		} catch(erroCheckInMaiorCheckOut e) {
		    System.out.printf("Error in reservation: " + e.getMessage());
		    System.exit(1);
		}

		System.out.print("Reservation: " + teste.printReversa());

		System.out.print("\nEnter data to update the reservation:\n");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		entCheckIn = entrada.nextLine();
		System.out.print("Check-out date (dd/MM/yyyy): ");
		entCheckOut = entrada.nextLine();

		try {
		    teste.atualizar(entCheckIn, entCheckOut);    
		} catch(erroCheckInMaiorCheckOut e) {
		    System.out.printf("Error in reservation: " + e.getMessage());
		    System.exit(1);
		}catch(erroUpdateDataAnterior e){
            System.out.printf("Error in reservation: " + e.getMessage());
		    System.exit(1);
        }

        System.out.print("Reservation: " + teste.printReversa());
         entrada.close();
	}
}

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class reserva {
	private int roomNumber;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
    private long nights;

	public reserva(int roomNumber, LocalDate checkInDate, LocalDate checkOutDate) throws erroCheckInMaiorCheckOut {
		if (checkOutDate.isBefore(checkInDate)){
		    throw new erroCheckInMaiorCheckOut();
		}
        
        this.roomNumber = roomNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
        this.nights = ChronoUnit.DAYS.between(this.checkInDate, this.checkOutDate);
	}
	
	public reserva(int roomNumber, String entCheckIn, String entCheckOut) throws erroCheckInMaiorCheckOut{
		LocalDate in = convertStrInDate(entCheckIn);
		LocalDate out = convertStrInDate(entCheckOut);
		if (out.isBefore(in)){
		    throw new erroCheckInMaiorCheckOut();
		}
		this.roomNumber = roomNumber;
		this.checkInDate = in;
		this.checkOutDate = out;
        this.nights = ChronoUnit.DAYS.between(this.checkInDate, this.checkOutDate);
	}

	public void atualizar(LocalDate newcheckInDate, LocalDate newcheckOutDate) throws erroCheckInMaiorCheckOut, erroUpdateDataAnterior{
		if (newcheckInDate.isBefore(this.checkInDate)){
            System.out.println("foi aqui");
		    throw new erroUpdateDataAnterior();
		}
        if (newcheckOutDate.isBefore(newcheckInDate)){
		    throw new erroCheckInMaiorCheckOut();
		}
        
        this.checkInDate = newcheckInDate;
		this.checkOutDate = newcheckOutDate;
	}
	
	public void atualizar(String entCheckIn, String entCheckOut) throws erroCheckInMaiorCheckOut, erroUpdateDataAnterior {
        LocalDate in = convertStrInDate(entCheckIn);
		LocalDate out = convertStrInDate(entCheckOut);
        if (in.isBefore(this.checkInDate)){
		    throw new erroUpdateDataAnterior();
		}
        if (out.isBefore(in)){
		    throw new erroCheckInMaiorCheckOut();
		}
		this.checkInDate = in;
		this.checkOutDate = out;
        this.nights = ChronoUnit.DAYS.between(this.checkInDate, this.checkOutDate);
	}

	public LocalDate getCheckInDate(){
	    return this.checkInDate;
	}
	
	public LocalDate getCheckOutDate(){
	    return this.checkOutDate;
	}

    public int getRoomNumber(){
	    return this.roomNumber;
	}

    public long getNights(){
	    return this.nights;
	}

    private LocalDate convertStrInDate(String str){
        String[] list = str.split("/");
		int d = Integer.parseInt(list[0]);
		int m = Integer.parseInt(list[1]);
		int y = Integer.parseInt(list[2]);
		
		LocalDate date = LocalDate.of(y, m, d);
		return date;
    }

    public String printReversa(){
        return String.format("Room %d, check-in: %02d/%02d/%04d, check-out: %02d/%02d/%d, %d nights\n",this.roomNumber, this.checkInDate.getDayOfMonth(), this.checkInDate.getMonthValue(), this.checkInDate.getYear(), this.checkOutDate.getDayOfMonth(), this.checkOutDate.getMonthValue(), this.checkOutDate.getYear(), nights);
    }
}

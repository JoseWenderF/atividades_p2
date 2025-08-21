public class erroCheckInMaiorCheckOut extends Exception{
    public erroCheckInMaiorCheckOut(String mensagem){
        super(mensagem);
    }

    public erroCheckInMaiorCheckOut(){
        super("Check-out date must be after check-in date");
    }
    
}

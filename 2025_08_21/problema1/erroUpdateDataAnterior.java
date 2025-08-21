public class erroUpdateDataAnterior extends Exception{
    public erroUpdateDataAnterior(String mensagem){
        super(mensagem);
    }

    public erroUpdateDataAnterior(){
        super("Reservation dates for update must be future dates");
    }
    
}
public class erroSaqueMaiorSaldo extends Exception {
    public erroSaqueMaiorSaldo(String mensagem){
        super(mensagem);
    }

    public erroSaqueMaiorSaldo(){
        super("Not enough balance");
    }
}
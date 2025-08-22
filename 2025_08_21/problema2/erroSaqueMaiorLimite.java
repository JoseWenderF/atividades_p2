public class erroSaqueMaiorLimite extends Exception {
    public erroSaqueMaiorLimite(String mensagem){
        super(mensagem);
    }

    public erroSaqueMaiorLimite(){
        super("The amount exceeds withdraw limit");
    }
}
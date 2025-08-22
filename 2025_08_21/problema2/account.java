public class account {
    private int numberAccont;
    private String holder;
    private double balance;
    private double limit;
    
    public account(int numberAccont, String holder, double balance, double limit){
        this.numberAccont = numberAccont;
        this.holder = holder;
        this.balance = balance;
        this.limit = limit;
    }

    public void withdraw(double amount) throws erroSaqueMaiorLimite, erroSaqueMaiorSaldo{
        if(amount > this.limit){
            throw new erroSaqueMaiorLimite();
        }
        if(amount>balance){
            throw new erroSaqueMaiorSaldo();
        }

        balance -= amount;
    }

    public int getNumberAccont(){
        return this.numberAccont;
    }

    public String getHolder(){
        return this.holder;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getLimit(){
        return this.limit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
}
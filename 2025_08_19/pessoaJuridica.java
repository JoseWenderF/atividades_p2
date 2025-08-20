public class pessoaJuridica extends pessoa{
    int employees;
    
    public pessoaJuridica(String name, double anualIncome, int employees){
        super(name, anualIncome);
        this.employees = employees;
    }
    
    public void setEmployees(int newEmployees){
        this.employees = newEmployees;
    }
    
    public int getEmployees(){
        return this.employees;
    }
    
    public double tax(){
        double taxAmount;
        
        if (employees > 10){
            taxAmount = anualIncome * 0.14;
        }
        else{
            taxAmount = anualIncome * 0.16;
        }
        return taxAmount;
    }
}

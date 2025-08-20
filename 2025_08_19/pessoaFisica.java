public class pessoaFisica extends pessoa{
    private double healthExpenditudes;
    
    public pessoaFisica(String name, double anualIncome, double healthExpenditudes){
        super(name, anualIncome);
        this.healthExpenditudes = healthExpenditudes;
    }
    
    public void setHealthExpenditudes(double newhealthExpenditudes){
        this.healthExpenditudes = newhealthExpenditudes;
    }
    
    public double getHealthExpenditudes(){
        return healthExpenditudes;
    }
    
    public double tax(){
        double taxAmount;
        if (anualIncome < 20000.0){
            taxAmount = anualIncome * 0.15;
        }
        else{
            taxAmount = anualIncome * 0.25;
        }
        
        if (healthExpenditudes > 0.0){
            taxAmount = taxAmount - (healthExpenditudes * 0.5);
        }
        
        return taxAmount;
    }
} 

public abstract class pessoa{

    String name;
    double anualIncome;

    public pessoa(String name, double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAnualIncome(double newAnualIncome){
        this.anualIncome = newAnualIncome;
    }

    public String getName(){
        return this.name;
    }

    public double getAnualIncome(){
        return this.anualIncome;
    }

    abstract double tax();

}
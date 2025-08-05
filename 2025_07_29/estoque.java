import java.util.Scanner;

public class estoque {

    private String nome;
    private int valor;
    private int quantidade;

    public estoque(String nome, int valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void adicionar(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Enter the number of products to be added in stock: ");
        int n = entrada.nextInt();
        this.quantidade+=n;
    }

    public void remover(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Enter the number of products to be removed from stock: ");
        int n = entrada.nextInt();
        this.quantidade-=n;
    }

    public void print_data()
    {
        System.out.println("\nProduct date: " + this.nome + ", $ " + this.valor + ", " + this.quantidade + " units, Total: $  " + this.quantidade*this.valor + "\n");
    }

    public void print_updat()
    {
        System.out.println("\nUpdate date: " + this.nome + ", $ " + this.valor + ", " + this.quantidade + " units, Total: $  " + this.quantidade*this.valor + "\n");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Enter product data:\n");
        System.out.print("Name: ");
        String nome = entrada.nextLine();
        System.out.print("Prince: ");
        int valor = entrada.nextInt();
        System.out.print("Quantity in stock: ");
        int quantidade = entrada.nextInt();
        int cont = 0;

        estoque teste_estoque = new estoque(nome, valor, quantidade);
        teste_estoque.print_data();
        while (true){
            System.out.println("Choose an option:\n0 - Exit\n1 - Added\n2 - Remove");
            cont = entrada.nextInt();
            if (cont == 0){
                break;
            } else if (cont == 1) {
                teste_estoque.adicionar();
                teste_estoque.print_updat();
            } else if (cont == 2) {
                teste_estoque.remover();
                teste_estoque.print_updat();
            } else {
                continue;
            }

        }
    }
}

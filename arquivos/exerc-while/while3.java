import java.util.Scanner;
public class while3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double prod, valor, em_real, soma_r, soma_d =0;
        prod = 0;
        soma_r = 0;
        soma_d = 0;

/*3)    Vamos ler o valor do dólar atual e o material comprado. 
Ao final de cada leitura exiba a conversão deste para 
cada produto e a soma dos produtos comprados em dólar e real. 
FLAG valor do produto igual a zero.*/

    System.out.println("");
    System.out.println("Digite o valor do seu produto em dolar: "); 
    prod = ler.nextDouble();
while (prod != 0){ 
    System.out.println("Quanto está o dolar atualmente?");
    valor = ler.nextDouble();
    
    em_real = prod * valor;
    soma_r = soma_r + em_real;
    soma_d = soma_d + prod;

    System.out.println("Preço do produto em Reais:  R$"+em_real+" reais");

    System.out.println("Digite o valor do seu produto em dolar: "); 
    prod = ler.nextDouble();
}
                System.out.println("Ao total, você deverá pagar R$"+soma_r+" reais");
                System.out.println("Ao total, você deverá pagar $"+soma_d+" dólares");
                
    }}


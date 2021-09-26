import java.util.Scanner;
    public class whileL3{

        public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);


            double conversao_reais,preço_produto,dol_atual,soma_conversao_reais,soma_preço_produto;
            soma_preço_produto = 0;
            preço_produto =  1;
            soma_conversao_reais = 0;

            while(preço_produto != 0){
                System.out.println("Valor do produto em Dólar($):" );
                preço_produto = ler.nextDouble();
                System.out.println("Valor do Dólar($) atual:" );
                dol_atual = ler.nextDouble();

                conversao_reais = preço_produto*dol_atual;
                soma_conversao_reais = soma_conversao_reais + conversao_reais;
                soma_preço_produto = soma_preço_produto + preço_produto;

                System.out.println("Preço do produto em Reais: "+conversao_reais+" R$");


            }
                System.out.println("Soma do valor do produto em Reais(R$): "+soma_conversao_reais);
                System.out.println("Soma do valor do produto em Dólares($): "+soma_preço_produto);

        }
    }
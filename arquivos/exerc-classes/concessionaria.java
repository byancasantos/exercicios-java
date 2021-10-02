import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



class Client {

    //atribuitos
        String nome, cpf, endereco;
    //metodo-acoes
      
    //estado
        String paraImpressao() {
            String dados = "TITULAR: " + this.nome;
            return dados;}
}

class Carro {

    //atribuitos
        Double ano,ipva,multas;
        String marca, placa;
    //metodo-acoes

    //estado
        String paraImpressao() {
        String dados = "\nANOS: " + this.ano;
        dados = "\nIPVA: " + this.ipva;
        dados = "\nMULTAS: " + this.multas;
        dados = "\nMARCAS: " + this.marca;
        dados = "\nPLACA: " + this.placa;
        return dados;}
}

public class concessionaria {
    //ler o pedido
        public void Ler(Client cli, Carro car){
            Scanner ler = new Scanner (System.in);

            System.out.println("\n DADOS PESSOAIS \nDigite o nome do titular: ");
            cli.nome = ler.next();
            System.out.println("\nDigite seu CPF: ");
            cli.cpf = ler.next();
            System.out.println("\nDigite seu endereço: ");
            cli.nome = ler.next();

            System.out.println("\n SOBRE VEÍCULO \nDigite o ano: ");
            car.ano = ler.nextDouble();
            System.out.println("\nDigite seu IPVA: ");
            car.ipva = ler.nextDouble();
            System.out.println("\nDigite valor da multa: ");
            car.multas = ler.nextDouble();
            System.out.println("\nDigite a marca do veículo: ");
            car.marca = ler.next();
            System.out.println("\nDigite a placa do veículo: ");
            car.placa = ler.next();
    }
    //imprimir o pedido
        public void imprime(Client clt, Carro crr) {
            System.out.println(clt.paraImpressao());
            System.out.println(crr.paraImpressao());
        }


        public static void main(String[] args) {
            concessionaria objeto = new concessionaria(); // cria o objeto da classe void
        Client ct= new Client();//cliente
        Carro cr = new Carro();//carro
        objeto.Ler(ct,cr);

        }    
}
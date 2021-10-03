import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



class Client {

    //atribuitos
        String nome;
        String cpf;
        String endereco;
    //metodo-acoes
      
    //estado
        String paraImpressao() {
            String dados = "\nTITULAR: " + this.nome;
            dados += "\nCPF: " + this.cpf;
            dados += "\nENDEREÇO: " + this.endereco;
            return dados;}
}

class Carro {

    //atribuitos
        Double ano,ipva,multas;
        String marca, placa;
    //metodo-acoes

    //estado
        String paraImpressao() {
        String dados = "\nANO: " + this.ano;
        dados += "\nIPVA: " + this.ipva;
        dados += "\nMULTAS: " + this.multas;
        dados += "\nMARCAS: " + this.marca;
        dados += "\nPLACA: " + this.placa;
        return dados;}
}

public class concessionaria {
    //ler o pedido
        public void Ler(Client cli, Carro car){
            Scanner ler = new Scanner (System.in);

            System.out.println("\n ≫ DADOS PESSOAIS ≪  \nDigite o nome do titular: ");
            cli.nome = ler.next();
            System.out.println("\nDigite seu CPF: ");
            cli.cpf = ler.next();
            System.out.println("\nDigite seu endereço: ");
            cli.endereco = ler.next();
            //System.out.println(cli.paraImpressao());

            System.out.println("\n ≫ SOBRE VEÍCULO ≪ \nDigite o ano: ");
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
    //imprimir o pedido - cliente
        public void imprimeCli(Client clt) {
            System.out.println(clt.paraImpressao());
        }

    //imprimir o pedido
        public void imprime(Client clt, Carro crr) {
            System.out.println(clt.paraImpressao());
            System.out.println(crr.paraImpressao());
        }

    //MUDAR IPVA
        public void ipva (Carro ipvaCr){
            Scanner ler = new Scanner (System.in);
            System.out.println("\nAltere o seu IPVA\n ANTIGO: "+ ipvaCr.ipva + "\nNOVO: ");
            ipvaCr.ipva = ler.nextDouble();
            System.out.println("\n CONFIRMANDO:"+ ipvaCr.ipva);
        }
    //PAGAR MULTAS 
        public void multas (Carro MultasCr){
            Scanner ler = new Scanner (System.in);
            System.out.println("\nVOCÊ TEM R$ "+ MultasCr.multas + " EM MULTAS.\n QUAL VALOR DESEJA PAGAR?\n");
            Double valor = ler.nextDouble();
            MultasCr.multas = MultasCr.multas - valor;
            System.out.println("\nVOCÊ TEM R$ "+ MultasCr.multas + " EM MULTAS ATUALMENTE.");
        }    
    //IDADE 
        public void idade (Carro idadeCr){
        }  
           
        public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
            concessionaria objeto = new concessionaria(); // cria o objeto da classe void
            double loop = 0;
        Client ct= new Client();//cliente

        Carro cr = new Carro();//carro
        objeto.Ler(ct,cr);
        
        System.out.println("\nO QUE DESEJA FAZER?\n 0 - SAIR\n 1- EXIBIR DADOS \n 2- MUDAR IPVA \n 3- PAGAR MULTAS\n 4- EXIBIR TODOS OS DADOS\n 5- EXIBIR IDADE DO CARRO");
        loop =ler.nextDouble();

        //MENU
        while (loop!=0){
            if (loop==1) {objeto.imprimeCli(ct);    
            }
            if (loop==2) {objeto.ipva(cr);    
            }
            if (loop==3) {objeto.multas(cr);
            }
            if (loop==4) {objeto.imprime(ct, cr); 
            }
            if (loop==5) {objeto.idade(cr);//?
                
            }
            System.out.println("\nO QUE DESEJA FAZER?\n 0 - SAIR\n 1- EXIBIR DADOS \n 2- MUDAR IPVA \n 3- PAGAR MULTAS\n 4- EXIBIR TODOS OS DADOS\n 5- EXIBIR IDADE DO CARRO");
            loop =ler.nextDouble();
        }
        
        }    
}
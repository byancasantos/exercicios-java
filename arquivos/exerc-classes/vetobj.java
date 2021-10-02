import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Cliente{
    //propriedades
    double  numero;
    String  cpf, datanascimento;
    String nome;
    String endereco;
    
    
    // construtor 
        void Clinente(String  cpf) {
        this.cpf = cpf;}
        
    //ações    
        String recuperaDadosParaImpressao() {
            String dados = "Titular: " + this.nome;
            return dados;}
            
        }


class Conta {
    //propriedades
    double  numero;
    String  agencia, dataDeAbertura;
    String titular; //cpf
    double saldo;
    
    // construtor 
    Conta(String  titular) {
    this.titular = titular;}
    
    String recuperaDadosParaImpressao() {
        String dados = "\nCpf: " + this.titular;
        dados += "\nSaldo: " + this.saldo;
        return dados;
        }
    
}
    
    
    


public class vetobj {
    public void  Ler(Conta lc1, Cliente Icl ) {
        //completar a leitura (A)
        Scanner ler = new Scanner (System.in);
        System.out.print("\nDigite o nome do Cliente:");
        Icl.nome = ler.next();
        System.out.print("\nDigite o seu saldo:");
        lc1.saldo = ler.nextDouble();
        System.out.print("\nDigite o seu CPF:");
        Icl.cpf = ler.next();
        //System.out.print("\nDigite o titular"+ Icl.cpf);
        lc1.titular = Icl.cpf; //vinculo
        
                //completando (A) 
        System.out.print("\nDigite a conta: ");
        Icl.numero = ler.nextDouble();
        System.out.print("\nDigite a agencia: ");
        lc1.agencia = ler.next();
        System.out.print("\nDigite a data de abertura: ");
        lc1.dataDeAbertura = ler.next();
        
        System.out.print("\nDigite o endereço: ");
        Icl.endereco = ler.next();
        System.out.print("\nDigite a data de nascimento: ");
        Icl.datanascimento = ler.next();
        
         }
    
    
    public void imprime(Conta Iconta, Cliente Icliente) {
        System.out.println(Iconta.recuperaDadosParaImpressao());
        System.out.println(Icliente.recuperaDadosParaImpressao());}
    
        //parte de DEPOSITAR
    public void deposita (Conta lc1){
        Scanner ler = new Scanner (System.in);
        double valordep=0;
        
        System.out.print("\nQual será seu deposito?");
        valordep=ler.nextDouble();
        
        lc1.saldo =  valordep+lc1.saldo;
        
    }
        //parte de ALTERAR DADOS
    public void alterar (Cliente alt){
        Scanner ler = new Scanner (System.in);
        System.out.print("\nDigite o seu endereço novamente:");
        alt.endereco = ler.next();
        System.out.print("Alterado com sucesso!\n Confirmando - Seu novo endereço é: "+alt.endereco);
    }
    
        //parte de PAGAR QUANTIA
    public void pagar (Conta pag){
        Scanner ler = new Scanner (System.in);
        double recebido = 0;
        System.out.println("Quanto deseja pagar?");
        recebido = ler.nextDouble();
        System.out.println("Você pagou R$ "+recebido);
        pag.saldo = pag.saldo + recebido;
        System.out.println("Seu saldo agora é de: "+pag.saldo);
    }
    
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double repetirloop = 0;
        vetobj objeto = new vetobj(); // cria o objeto da classe void
        Conta cN = new Conta(null);//conta
        Cliente cL = new Cliente();//cliente
        objeto.Ler(cN,cL);
        
        //loop de pergunta 0 sai
        System.out.println("\nO que deseja fazer?\n 0-sair\n 1-depositar \n 2-alterar cadastro \n 3-pagar conta\n 4-saldo");
        repetirloop =ler.nextDouble();
        
        //menu estrutura de repeticao if / menu (B)
        while (repetirloop!=0) {
            if (repetirloop==1) {objeto.deposita(cN); //op 1
            }
            if (repetirloop==2) {objeto.alterar(cL); //op 2
            }
            if (repetirloop==3) {objeto.pagar(cN); //op 3
            }
            if (repetirloop==4) {objeto.imprime(cN,cL); //op 3
            }
        
            //loop de pergunta 0 sai
            System.out.println("\nO que deseja fazer?\n 0 - sair\n 1-depositar \n 2-alterar cadastro \n 3-pagar conta\n 4-saldo");
            repetirloop =ler.nextDouble();

    }

}}
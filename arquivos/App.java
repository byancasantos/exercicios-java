import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //1)Vamos criar uma lógica que leia a idade de n pessoas e ao final exiba a mais nova. 
        //O FLAG será quando a idade for 1000.
            Scanner ler = new Scanner (System.in);;
            //variáveis
            int  idade, menoridade;
            menoridade=1000;
    
            System.out.println("Digite a sua idade:" );
            idade= ler.nextInt();
    
            while (idade!=1000) {
                if (idade<menoridade) {
                    menoridade=idade;
                }
                System.out.println("Digite a sua nova idade:" );
                idade= ler.nextInt();
            }
    
            System.out.println("A menor idade é:" + menoridade );
    
        }
    }


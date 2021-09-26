import java.util.Arrays;
import java.util.Collections;
public class test {

    public static void main(String args[]) {
        import java.util.Scanner;
            Scanner ler = new Scanner (System.in);
                
            //declaração dos vetores
            double[] altura = new double[5]; // vetor vai de zero ate 4
            String [] nome = new String[5];
            int i=0 ;
            int maior_alt=0;
            double soma=0,medsoma=0;
            String pessoas = "" ;
            
            
        
                //entrada é aleitura dos dados
                for (i=0;i<=4;i++) {
                    System.out.print((i+1) + "-> Digite seu nome:");
                    nome[i]= ler.next();
                    System.out.print((i+1) + "-> Digite sua altura:");
                    altura[i]= ler.nextDouble();
        
                    soma = soma + altura[i];
        
                    if (altura[i]>=altura[maior_alt]) {
                        maior_alt=i;    
                    }
                }
                medsoma = soma/i;
        
                for (i=0;i<=4;i++) {
                    if(altura[i]>medsoma){
                        pessoas = pessoas+(",")+nome[i];
                    }
                }
                         
        
                System.out.println( nome[maior_alt] + ", Vc é a pessoa mais alta");
                System.out.println( "Média de todas as alturas: "+medsoma);
                System.out.println(pessoas+" são as pessoas com a altura maior q a média");
                
                
        
        }
            }
    }


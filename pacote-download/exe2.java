import java.util.Scanner;
import java.util.Arrays;
public class exe2 {
    public static void main(String[] args) {
        /*2) em um vetor de numeros foi digitado a altura de 50 pessoas. 
        Ao final imprima o vetor em ordem crescente.*/ 
        Scanner ler = new Scanner (System.in);
        int i = 0; 
        int j=0;
        int aux=0;
        int [] numeros = new int[5];
        
        for (i=0; i<5; i++) {
        
        System.out.println("Digite a altura do usuario"+(1+i)+": ");
        numeros[i] = ler.nextInt();

            }

            //processamento
            for (i=0; i<5; i++) {
                for (j=0; j<4; j++) {
                   if (numeros[j]>numeros[j+1]){
                        aux=numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = aux;
                    }
                }
            }
                //impressao
            for (i=0; i<5; i++) {
        
                System.out.println("\n O valor: "+(1+i)+" : "+ numeros[i]);
                numeros[i] = ler.nextInt();
         }}}


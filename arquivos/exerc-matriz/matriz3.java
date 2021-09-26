import java.util.Scanner;
public class matriz3 {
    public static void main(String[] args) {
        /*3) Vamos elaborar um mapeamento para sala de cinema:
            a) leia uma matriz quadrada de vinte elementos
            b) o sistema deve dar ao usuario a possibilidade de ver os locais vagos
            c) o sistema deve dar ao usuario a possibilidade de escolher um local
            d) o programa termina quando o usuario digitar fim
            e) exiba o numero de cadeiras ocupadas */

     int L=0, C=0, cont=0, continuar=0;
     Scanner ler = new Scanner (System.in);
     int  matriz [][] = new int[3][3];
     do {
    //lugares
    System.out.print("Lugares disponíveis:\n");
    for (L=0;L<3;L++) { //linha
        for (C=0;C<3;C++) { //coluna
            System.out.print(+matriz[L][C]+" ");  
        }   
            System.out.println();
        }
        
     //leitura  
     System.out.print("Digite o lugar desejado\n");
        for (L=0;L<3;L++) { //linha
        for (C=0;C<3;C++) { //coluna
            System.out.print("Linha("+ L +") e Coluna(" + C + "):"  );
            matriz[L][C]= ler.nextInt();
        }}
        

     //impressão
     System.out.print("Atualização dos lugares disponíveis:\n");
    for (L=0;L<3;L++) { //linha
        for (C=0;C<3;C++) { //coluna
            System.out.print(+matriz[L][C]+" ");  
        }   
            System.out.println();
        }

        System.out.print("Para continuar a sua seleção, digite 0\n"  );
        continuar= ler.nextInt();
} while (continuar == 0 );
}}

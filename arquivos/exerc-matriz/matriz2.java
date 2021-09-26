import java.util.Scanner;
public class matriz2 {
    public static void main(String[] args) {
		int L=0, C=0, soma=0, contador=0, media=0;
		Scanner ler = new Scanner (System.in);
		
		int  a [][] = new int[5][5];
		int  b [][] = new int[5][5];
		int  c [][] = new int[5][5];
		


		/*2) leia uma matriz 3x3 inicial e crie uma nova matriz aonde os elementos sao o dobro dos valores lidos na matriz inicial.
								a) ao final exiba em uma nova matriz a soma das duas matrizes criadas*/


		//leitura
		for (L=0;L<2;L++) { //linha
			for (C=0;C<2;C++) { //coluna
				System.out.print("Digite o valor de A L("+ L +") C(" + C + "):"  );
				a[L][C]= ler.nextInt();	
				b [L][C] = a[L][C]*2;
				
		}}//fecha a linha e coluna
		
		//processamento
		for (L=0;L<2;L++) { //linha
			for (C=0;C<2;C++) { //coluna
				c [L][C] =a[L][C] + b [L][C];
				
		}}


		//impressão
		
		/*System.out.print("\n Matriz A:"); 
			for (L=0;L<2;L++) { //linha
				for (C=0;C<2;C++) { //coluna
					System.out.print("\n A= Linha("+L+") x Coluna("+C+") =" + a[L][C]);		
				}}*/
				System.out.print("\n Matriz A -      Matriz B -      Matriz C: \n"); 
				for (L=0;L<2;L++) { //linha
					for (C=0;C<2;C++) { //coluna
						System.out.print("A= Linha("+L+") x Coluna("+C+") =" + a[L][C]);        
						System.out.print("     B= Linha("+L+") x Coluna("+C+") =" + b[L][C]);        
						System.out.print("     C= Linha("+L+") x Coluna("+C+") =" + c[L][C] +"\n");        
				}}
			}}
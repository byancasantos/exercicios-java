import java.util.Scanner;
public class matriz1 {
    //1) apresente a media da diagonal principal de uma matriz quadrada 4x4
    public static void main(String[] args) {
        int i=0, r=0, soma=0, contador=0, media=0;
		Scanner ler = new Scanner (System.in);
		
		int  altura [][] = new int[5][5];
		
		//leitura
				for (i=0;i<2;i++) { //linha
					for (r=0;r<2;r++) { //coluna
						System.out.print("Digite a altura Linha("+ i +") Coluna(" + r + "):"  );
						altura[i][r]= ler.nextInt();				
				}}//fecha a linha e coluna
		
		//processamento
				for (i=0;i<2;i++) { //linha
					for (r=0;r<2;r++) { //coluna
					if (i==r) {
						soma=soma+altura[i][r];
						contador++;
					}}}	
				media = soma/contador;
		
		//impressão
		
				System.out.print("\n A média da diagonal principal é: " + media);	
				
					for (i=0;i<2;i++) { //linha
						for (r=0;r<2;r++) { //coluna
							System.out.print("\n Altura ["+i+"]x["+r+"]=" + altura[i][r]);		
				}}}}

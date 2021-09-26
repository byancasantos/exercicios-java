import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
    int i=0, r=0, aux=0;
    Scanner ler = new Scanner (System.in);
		int  altura [][] = new int[5][5];
		//leitura
		for (i=0;i<2;i++) { //linha
			for (r=0;r<2;r++) { //coluna
				System.out.print("Digite a altura L("+ i +") C(" + r + "):"  );
				altura[i][r]= ler.nextInt();				
		}}//fecha a linha e coluna
		
		//processamento
			
		
		//impressão
		
			for (i=0;i<3;i++) { //linha
				for (r=0;r<3;r++) { //coluna
					System.out.print("\n Altura ["+i+"]x["+r+"]=" + altura[i][r]);		
				}}
			
		}}


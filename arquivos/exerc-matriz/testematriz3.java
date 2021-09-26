import java.util.Scanner;
public class testematriz3 {
    public static void main(String[] args) {
		int i=0, r=0, elinha=0, ecoluna=0, contarreservado=0, contarlivre=0;
		String pedido="";
		Scanner ler = new Scanner (System.in);
		
		String  cinema [][] = new String[5][4];
		
		//leitura
				for (i=0;i<5;i++) { //linha
					for (r=0;r<4;r++) { //coluna
						cinema[i][r]= "   LIVRE   |  ";}}//fecha a linha e coluna
				
		
				
		//processamento			
		System.out.print("Deseja escolher um local (Sim ou Não)?" );
		pedido= ler.next();
		
		while(!(pedido.equalsIgnoreCase("Não"))){
            System.out.print("\nVeja os lugares disponíveis:\n" );
			//exibir os lugares vagos
			for (i=0;i<5;i++) { //linha
				for (r=0;r<4;r++) { //coluna
						System.out.print("["+i+"]x["+r+"]=" + cinema[i][r]);		
					    			}System.out.print("\n");}
			
			//escolher um local
            System.out.print("\nDigite a Fileira desejada: (0 a 4) \n "  );
            elinha = ler.nextInt();
            System.out.print("Digite a Coluna desejada: (0 a 3) \n "  );
            ecoluna = ler.nextInt();
			if ((elinha>4)||(ecoluna>3)){

			}else{

			//ocupar o local escolhilho
			if (!(cinema[elinha][ecoluna].equalsIgnoreCase("  OCUPADO  |  "))){
				cinema[elinha][ecoluna]= "  OCUPADO  |  ";
				System.out.println("Você escolheu a fileira ("+elinha+") e a coluna ("+ecoluna+")!\n\n");}
				else { 
					System.out.print("ERRO: Este local não esta vago!/n" );	
			}System.out.print("Deseja escolher um outro local(Sim/Não)?" );
			pedido= ler.next();}//fecha if
		}//fecha while
		
		
		//impressão final 		
		System.out.println("\n CINEMA - LUGARES DISPONÍVEIS\n"); 
		for (i=0;i<5;i++) { //linha
			for (r=0;r<4;r++) { //coluna
					System.out.print("["+i+"]x["+r+"]=" + cinema[i][r]);
					if ((cinema[i][r].equalsIgnoreCase("  ***  |  "))){
						//contar a qtd de locais livres
						contarreservado++;
					}
				    			}System.out.print("\n");}
		
		System.out.print("A quantidade de locais opucados: \n"+contarlivre);
		}}


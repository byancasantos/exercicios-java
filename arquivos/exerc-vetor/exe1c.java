import java.util.Scanner;
public class exe1c {

    /* 50 nome e altura
     a) nome da pessoa mais alta 
     b) media das alturas 
     c) nome das pessoas com a altura superior a média 
     */

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
       
        double [] altura = new double [5];
        String [] nomes = new String [5];
        double soma =0, media;
        String pmm = "" ;
        //
        int i = 0, Maiorid = 0;

        
        for (i=0; i<=4; i++) {
        System.out.println((1+i)+"- Digite o seu nome: ");
        nomes[i] = ler.next();
        System.out.println((1+i)+"- Digite a sua altura: ");
        altura[i] = ler.nextDouble();
            
        /* letra b)*/ soma = soma + altura[i];

    /* letra a)*/ 
        if (altura[1]>= altura [Maiorid]) {
            Maiorid=i;
        }
    }

    /* letra b)*/   
        media = soma/i;

        /*letra c*/
        //nome das pessoas com idade superior a media
        for (i=0;i<=4;i++) {
        if(altura[i]>media){
            pmm = pmm+("\n")+nomes[i];
        }
    }


    System.out.println(nomes[Maiorid]+", Você é o cliente mais alto(a)! " + "\n Sua altura é:"+ altura[Maiorid]+ "\n A média das alturas é: "+ media);
    System.out.println("Com a altura acima da média, há:"+pmm);
    }}
    


import java.util.Scanner;
//import jdk.internal.joptsimple.internal.Strings;
public class while2 {
    public static void main(String[] args) {
       // Vamos ler o salário de n funcionários. 
       //Informe o novo salário (setor a 10% setor b 20%). 
       //Ao final exiba para cada funcionário o seu salário e o montante mensal que a empresa deve pagar. 
       //O FLAG será uma pergunta. 
       Scanner ler = new Scanner (System.in);
       double salario, mtt = 0;
       String setor, cont;
       System.out.println("Deseja consultar um novo salário? ");
       cont = ler.next();
        while (cont.equalsIgnoreCase("s")){
       System.out.println("Digite seu salario: ");
       salario = ler.nextDouble();

       System.out.println("Você pertence ao setor a ou b? ");
       setor = ler.next();
        if (setor.equalsIgnoreCase("a")){
            mtt = salario * 0.1;
            salario = salario + (salario * 0.1);

        }else{
            mtt = salario * 0.2;
            salario = salario + (salario * 0.2) ;
        } 
        System.out.println("Montante de: R$"+mtt+"0 reais");
        System.out.println("Seu novo salário é de: R$"+salario+"0 reais");
        System.out.println("Deseja consultar um novo salário? ");
    cont = ler.next();
}
    }}

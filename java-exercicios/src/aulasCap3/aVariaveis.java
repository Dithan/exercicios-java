package aulasCap3;
import java.util.Scanner;


public class aVariaveis {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //inteiro
        int idade = leitor.nextInt();

        /* 
        //Flutuante
        float cotacaoDolar = leitor.nextFloat();

        //?
        double cotacaoEuro = leitor.nextDouble();
        
        //Lê até clicar em Enter
        String nome = leitor.nextLine();

        //Lê somente uma palavra
        String codigoRua = leitor.next();
         */

        
        System.out.println(idade);

        leitor.close();
    }
}

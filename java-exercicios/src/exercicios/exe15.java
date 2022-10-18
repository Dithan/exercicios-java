package exercicios;
import java.util.Scanner;

public class exe15{
  public static void main(String[] args) throws Exception{
    /* Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200; */

    Scanner leitor = new Scanner(System.in);

    //Mensagem e input respectivamente
    System.out.println("Informe um número: ");
    int numero = leitor.nextInt();

    if(numero <= 200 && numero >= 100){
      System.out.println("Seu Número está entre 100 e 200");
    }else{
      System.out.println("Seu número NÃO está entre 100 e 200");
    }
    
    leitor.close();
  }

}
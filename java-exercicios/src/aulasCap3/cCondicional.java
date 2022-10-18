package aulasCap3;

public class cCondicional {
  public static void main(String[] args) throws Exception {
    //Média do aluno
    int media = 9;

    //Se aprovado com nota máxima
    if(media == 10){
      System.out.println("Parabéns você conseguiu nota MAXIMA!!!");
      //Se aprovado
    }else if(media >= 7){
      System.out.println("Parabéns, você foi Aprovado!");
      //Se reprovado
    } else{
      System.out.println("Você foi reprovado, procure seu professor.");
    }
  }
  
}

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();


        ArrayList<Aluno>list = new ArrayList<>();

        System.out.println("quantos alunos?");
        int numeroAlunos = leitor.nextInt();




        for (int i = 0; i < numeroAlunos ; i++) {


            System.out.println("nome do aluno");

            String nome =  leitor.next();





            System.out.println("noTA 1");
            double nota1 = leitor.nextInt();


            System.out.println("nota 2");
            double nota2 = leitor.nextInt();

            System.out.println("nota 3");
            double nota3 = leitor.nextInt();



            list.add( new Aluno(nome, nota1, nota2, nota3));

        }








        int opcao;

        while (true){
            System.out.println("--------------------");
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1. Média para cada Aluno 1");
            System.out.println("2. Aluno com maior Média 2");
            System.out.println("3. Aluno com menor Média 3");
            System.out.println("4. procurar aluno Pelo nome 4");
            System.out.println("5. Sair");
            System.out.println("--------------------");
            System.out.print("Digite a opção: ");

            opcao = leitor.nextInt();

            double maiorMedia = 0;
            String nomeDoMaior = "";
            double menorMedia = 10;
            String nomeDoMenor = "";

            if (opcao == 1){

              for (Aluno mediasAlunos : list){
                  double media = mediasAlunos.mediaAluno();
                  System.out.println("nome: " + mediasAlunos.nome + " // media: " + media);
              }

            } else if (opcao == 2) {
                for (Aluno a : list){
                    double media = a.mediaAluno();
                    if (media > maiorMedia){
                        nomeDoMaior = a.nome;
                        maiorMedia = media;
                    }


                }
                System.out.println("Aluno com maior Média");
                System.out.println( nomeDoMaior + " com " + maiorMedia + " de média" );

            } else if (opcao == 3) {
                for (Aluno a : list){
                    double media = a.mediaAluno();
                    if (media < menorMedia){
                        nomeDoMenor = a.nome;
                        menorMedia = media;
                    }


                }
                System.out.println("Aluno com menor Média");
                System.out.println(nomeDoMenor + " com " + menorMedia + " de média" );

            } else if (opcao == 4) {
                System.out.println("digite o nome que deseja procurar");
                String nomeComparado = leitor.next();
                for (Aluno nomeAluno : list){

                    if (nomeComparado.equals(nomeAluno.nome)){
                        System.out.println("vc comparou corretamente");
                        System.out.println(nomeAluno.nome + " com media de " + nomeAluno.mediaAluno());
                    }
                }

            } else if (opcao == 5) {
                System.out.println("encerrando");

                break;
            }


        }



    }
}
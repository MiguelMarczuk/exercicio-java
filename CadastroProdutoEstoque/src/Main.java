import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);


        Estoque estoque = new Estoque();

        int opcao;
        while (true){



            System.out.println("Bem vindo ao menu");
            System.out.println("------------------------------");
            System.out.println("Adicionar Produto 1" );
            System.out.println("listar produtos 2");
            System.out.println("calcular valor total 3");
            System.out.println("buscar produto 4 ");
            System.out.println("filtrar produto com estoque baixo 5");
            System.out.println("sair do programa 6");
            System.out.println("------------------------------");
            System.out.println("digite a opção");

            opcao = leitura.nextInt();
            if (opcao == 1){
              estoque.adicionarProduto();

            } else if (opcao == 2) {
               estoque.listandoProdutos();


            } else if (opcao == 3) {
                System.out.println("valor total do estoque");
                System.out.println(estoque.valorTotal() + "R$");

            } else if (opcao == 4) {
                System.out.println("Buscar produto");
                estoque.buscarProduto();

            } else if (opcao == 5) {

                   estoque.menorEstoque();
            } else if (opcao == 6) {
                System.out.println("encerrando");
                break;
            }else {
                System.out.println("numero invalido");
            }
        }



    }
}
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Estoque  {
    ArrayList<Produto> list = new ArrayList<>();


    void adicionarProduto(){
        Scanner leitura = new Scanner(System.in);
        Produto produto = new Produto();


        System.out.println("digite nome do produto");
        produto.setNome( leitura.next());

        System.out.println("digite o preço do produto");
        produto.setPreco( leitura.nextDouble());

        System.out.println("digite a quantidade do produto");
        produto.setQuantidade( leitura.nextInt());

        list.add(produto);

    }


    void listandoProdutos(){
        System.out.println("listando produto");
        list.sort(Comparator.comparing(Produto::getNome));
        System.out.println(list.toString());
    }



    double valorTotal(){
        double total = 0;
        for (Produto a : list){
         double somar = a.getPreco() * a.getQuantidade();
          total += somar;
        }

        return total;
    }

    void buscarProduto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja buscar:");

        String nomedigitado = leitor.next();

        boolean nomevalido = false;

        for (Produto item : list){
            if (nomedigitado.equals(item.getNome())){
                System.out.println("Produto: " + item.getNome());
                System.out.println("Preco: " + item.getPreco() + "R$");
                System.out.println("Quantidade: "+item.getQuantidade());
                nomevalido = true;
            }}

               if (!nomevalido) {
                   System.out.println("Nome inexistente ou inválido");
               }
    }

    void menorEstoque(){

        if (list.isEmpty()){
            System.out.println("Não há produtos no estoque");
            return;
        }
        int estoque = Integer.MAX_VALUE;
        for (Produto item : list){
           if (item.getQuantidade() < estoque){
               estoque = item.getQuantidade();

           }}

            System.out.println("Produtos com menor estoque:");
           for (Produto item : list){
               if (item.getQuantidade() == estoque){
                   System.out.println("Produto: " + item.getNome());
                   System.out.println("Preço: " + item.getPreco() + " R$");
                   System.out.println("Quantidade: " + item.getQuantidade());
                   System.out.println("------------------------");
               }
           }



    }

}

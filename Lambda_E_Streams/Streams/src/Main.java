import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

              IntSummaryStatistics sta =  numeros.stream()
                        .mapToInt(n -> n.intValue())
                        .summaryStatistics();


        System.out.println("maior numero" + sta.getMax());
        System.out.println(sta.getAverage());




        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

      var agrupamentoCaracter =  palavras.stream()
                .collect(Collectors.groupingBy(p -> p.length()));


        System.out.println(agrupamentoCaracter);


        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

            var nomess =    nomes.stream()
                        .collect(Collectors.joining(","));

        System.out.println(nomess);

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
         IntSummaryStatistics sta = numeros.stream()
                 .filter(n -> n  % 2 == 0)
                 .peek(System.out::println)
                 .map(n -> n * n)
                 .peek(n-> System.out.println("multiplicando" + n))
                 .mapToInt(n -> n.intValue())
                 .summaryStatistics();

        System.out.println("soma dos quadrados " + sta.getSum());

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(n -> n  % 2 == 1)
                .forEach(System.out::println);



        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );


     List<Produto> produtosCostumizados =   produtos.stream()
                .filter(n -> n.getCategoria().equals("Eletrônicos") && n.getPreco() < 1000)
                .sorted(Comparator.comparing(n -> n.getPreco()))
                .collect(Collectors.toList());

        System.out.println(produtosCostumizados);


        Map<String , List<Produto>> stringMap = produtos.stream()
                .collect(Collectors.groupingBy(n-> n.getCategoria()));



        Map<String, Long> mapQuantidadeProdutos = produtos.stream()
                        .collect(Collectors.groupingBy(p-> p.getCategoria(), Collectors.counting()));

        System.out.println(mapQuantidadeProdutos);


        Map<String, Optional<Produto>> produtoMaisCaro = produtos.stream()
                .collect(Collectors.groupingBy(p -> p.getCategoria(),
                        Collectors.maxBy(Comparator.comparing(p-> p.getPreco()))));
        System.out.println(produtoMaisCaro);



        Map<String, Double> totalpreco = produtos.stream()
                .collect(Collectors.groupingBy(p-> p.getCategoria(),
                        Collectors.summingDouble(p-> p.getPreco())));

        System.out.println(totalpreco);


    }
        }

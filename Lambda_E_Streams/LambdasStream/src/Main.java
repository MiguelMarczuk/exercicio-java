import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6,40);
//
//        numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);
//
//
//        List<String> palavras = Arrays.asList("java", "stream", "lambda");
//
//        palavras.stream()
//                .map(p -> p.toUpperCase())
//                .forEach(System.out::println);
//
//
//    List<Integer> numeross = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//        List<Integer> numerosImparesMultiplicados = numeross.stream()
//            .filter(n -> n % 2 == 1)
//            .map(n -> n * 2)
//            .collect(Collectors.toCollection(ArrayList::new));
//
//        numerosImparesMultiplicados.forEach(System.out::println);

//
//        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
//
//        palavras.stream()
//                .distinct()
//                .forEach(System.out::println);


//        List<List<Integer>> listaDeNumeros = Arrays.asList(
//                Arrays.asList(1, 2, 3, 4),
//                Arrays.asList(5, 6, 7, 8),
//                Arrays.asList(9, 10, 11, 12)
//        );
//
//      List<Integer> numerosPrimos =  listaDeNumeros.stream()
//                .flatMap(List::stream)
//                .filter(Main :: ehPrimo)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(numerosPrimos);
//
//}
//    private static boolean ehPrimo(int numero) {
//        if (numero < 2) return false; // Números menores que 2 não são primos
//        for (int i = 2; i <= Math.sqrt(numero); i++) {
//            if (numero % i == 0) {
//                return false; // Divisível por outro número que não 1 e ele mesmo
//            }
//        }
//        return true;



//        List<Pessoa> pessoas = Arrays.asList(
//                new Pessoa("darlice", 22),
//                new Pessoa("Alice", 22),
//                new Pessoa("Bob", 17),
//                new Pessoa("Charlie", 19)
//        );
//
//        pessoas.stream()
//                .filter(p -> p.idade > 18)
//                .map(p -> p.nome)
//                .sorted()
//                .forEach(System.out::println);


//
//        List<Produto> produtos = Arrays.asList(
//                new Produto("Smartphone", 800.0, "Eletrônicos"),
//                new Produto("Notebook", 1500.0, "Eletrônicos"),
//                new Produto("Teclado", 200.0, "Eletrônicos"),
//                new Produto("Cadeira", 300.0, "Móveis"),
//                new Produto("Monitor", 900.0, "Eletrônicos"),
//                new Produto("Mesa", 700.0, "Móveis")
//        );
//
//      List<Produto>  produtosOrganizado =  produtos.stream()
//                .filter(p -> p.getCategoria().equals("Eletrônicos") && p.getPreco() <= 1000)
//              .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
//              .limit(3)
//                .collect(Collectors.toList());
//
//        System.out.println(produtosOrganizado);







}}
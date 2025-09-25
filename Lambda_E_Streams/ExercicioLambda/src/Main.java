import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Multiplicacao multiplica = (a, b) -> a * b;

        System.out.println(multiplica.multiplicacao(5, 5));

        VerificadorPrimo primo = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println(primo.primo(17));

        ConverteMaiuscula converteMaiuscula = s -> s.toUpperCase();
        System.out.println(converteMaiuscula.conversorMaiscula("ola mundo "));


        Palindromo converPalindromo = str -> {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            if (str.equals(sb.toString())) {
                System.out.println(str + " é um palíndromo");
                return true;
            } else {
                System.out.println(str + " não é um palíndromo");
                return false;
            }

        };

        System.out.println(converPalindromo.verificarPalindromo("arara"));

        List<Integer> integerList =  Arrays.asList(1,2,3,4,5);
       integerList.replaceAll(n -> n * 3);

        System.out.println(integerList);


        List<String> ordena = Arrays.asList("c" , "b" , "f" , "a" , "d" , "e");

        ordena.sort((s , b) -> s.compareTo(b));
        System.out.println(ordena);



        Divisao divisao = (a, b) -> {
          if (b == 0){
              throw new ArithmeticException("divisor nao pode ser 0");
          }
          return a/b;
        };

        try {
            System.out.println(divisao.dividir(10, 2));
        System.out.println(divisao.dividir(10, 0));

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
};





package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("numero1");
        int numero1 = leitor.nextInt();
        System.out.println("numero2");
        int numero2 = leitor.nextInt();
        try {
            int resultado = numero1 / numero2;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Error, pois foi colacado valor 0 na divisao");
            System.out.println(e.getMessage());
        }



    }
}

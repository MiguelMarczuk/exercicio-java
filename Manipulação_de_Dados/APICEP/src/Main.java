import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        CepConsulta consulta = new CepConsulta();
        GerarArquivo gerador = new GerarArquivo();

        while (true) {
            System.out.println("Digite o CEP que deseja buscar (ou 'sair' para encerrar):");
            String busca = leitor.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Endereco endereco = consulta.buscarCep(busca);
                System.out.println("Resultado: " + endereco);

                gerador.geradorDeArquivo(endereco);
                System.out.println("Salvo em arquivo!");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}

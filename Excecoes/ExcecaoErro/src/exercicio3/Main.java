package exercicio3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);

        String busca = leitor.nextLine();

        String endereco = "https://api.github.com/users/" + busca;
        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());




            int status = response.statusCode();


            if (status == 404) {
                throw new ErrorNomeExecption("nome invalido no GITHUB");
            }


            System.out.println(response.body());
        }catch (ErrorNomeExecption e){
            System.out.println(e.getMessage());
        }

    }



}

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";



        Gson gson  = new GsonBuilder().setLenient().create();
        PessoaGson pessoa = gson.fromJson(jsonPessoa,  PessoaGson.class);

        System.out.println(pessoa);

        Gson gsonLivro = new Gson();
        Livro livro = gsonLivro.fromJson(jsonLivro, Livro.class);

        System.out.println(livro);


        }


}

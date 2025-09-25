package exercicio2;

public class ErroSenha extends RuntimeException {


    public ErroSenha(String mensagem) {
        super(mensagem);
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

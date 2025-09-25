import java.util.ArrayList;

public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;

    public Aluno() {

    }

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }





    double mediaAluno(){
        return (nota1 + nota2 + nota3) / 3;
    }





    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }
}

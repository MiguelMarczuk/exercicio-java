import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

       Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();


       pessoa.setNome("marcos");
       pessoa.setIdade(14);


        pessoa2.setNome("fernando");
        pessoa2.setIdade(18);


        pessoa3.setNome("frederico");
        pessoa3.setIdade(25);

        ArrayList<Object> mylist = new ArrayList<>();

        mylist.add(pessoa);
        mylist.add(pessoa2);
        mylist.add(pessoa3);

        System.out.println(mylist.size());
        System.out.println(mylist.get(0).toString());

        System.out.println(mylist.toString());
    }
}
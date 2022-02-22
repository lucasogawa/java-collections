import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //1) adicione alguns alunos
        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");

        //2) imprima o tamanho da colecao
        System.out.println("Size of alunos: " + alunos.size());

        //3) tente adicionar um aluno que existe
        System.out.println(alunos.add("Aluno 1"));
        System.out.println(alunos.add("Aluno 2"));

        //4) imprima novamente o tamanho da colecao
        System.out.println("Size of alunos: " + alunos.size());
    }
}
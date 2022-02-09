import java.util.*;

public class TestaCurso {

    public static void main(String[] args) {
        // crie um novo curso passando o nome e instrutor no construtor
        Curso curso = new Curso("Java Collections", "Paulo");

        // chame o getter da lista de aulas do curso e imprima o resultado
        System.out.println(curso.getAulas());
    }
}

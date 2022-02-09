import java.util.*;

public class TestaCurso {

    public static void main(String[] args) {
        // crie um novo curso passando o nome e instrutor no construtor
        Curso curso = new Curso("Java Collections", "Paulo");

        // chame o getter da lista de aulas do curso e imprima o resultado
        System.out.println(curso.getAulas());

        // adicione novas aulas na classe Curso
        curso.adiciona(new Aula("Aula 1", 1));
        curso.adiciona(new Aula("Aula 2", 2));
        curso.adiciona(new Aula("Aula 3", 3));

        System.out.println(curso.getAulas());
    }
}
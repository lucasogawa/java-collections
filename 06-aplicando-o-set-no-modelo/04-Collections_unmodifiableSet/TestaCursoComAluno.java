public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso cursos = new Curso("Curso 1", "Instrutor 1");

        cursos.adiciona(new Aula("Aula 1", 1));
        cursos.adiciona(new Aula("Aula 2", 2));
        cursos.adiciona(new Aula("Aula 3", 3));

        Aluno a1 = new Aluno("Aula 1", 1);
        Aluno a2 = new Aluno("Aula 2", 2);
        Aluno a3 = new Aluno("Aula 3", 3);

        cursos.matricula(a1);
        cursos.matricula(a2);
        cursos.matricula(a3);

        cursos.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        cursos.getAlunos().add(new Aluno ("Aula 4", 4));
   }
}
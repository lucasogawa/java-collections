import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo.");
        }
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas
            .stream()
            .mapToInt(Aula::getTempo)
            .sum();
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;

        return this.nome.equals(outro.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", tempo total: " + getTempoTotal() + ", aulas: [" + aulas + "]";
    }
}
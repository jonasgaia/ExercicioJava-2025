//12 - Escreva um programa que use herança para criar uma classe Aluno
//que herda de Pessoa e adiciona um atributo matricula.

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
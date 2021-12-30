package Associacao.classes;

public class aluno {
    private String nome;
    private int idade;
    private seminario seminario;

    public aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public aluno() {
    }

    public void print() {
        System.out.println("Nome " + this.nome);
        System.out.println("Idade " + this.idade);
        if (seminario != null) {
            System.out.println("Semináriio " + this.seminario.getTitulo());
            return;
        }
            System.out.println("Aluno não inscrito");

    }

    public Associacao.classes.seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Associacao.classes.seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

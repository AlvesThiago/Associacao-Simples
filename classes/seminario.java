package Associacao.classes;

public class seminario {
    private String titulo;
    private aluno[] alunos;
    private professor professor;
    private local local;


    public seminario(String titulo) {
        this.titulo = titulo;
    }

    public seminario() {
    }

    public void print() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("----------------------------");
        System.out.println("Professor palestrante " + this.professor.getNome());
        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
            System.out.println("---------------------------------");
        } else {
            System.out.println("Nenhum local cadastrado");
        }

        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes ");
            for (aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }

    public Associacao.classes.local getLocal() {
        return local;
    }

    public void setLocal(Associacao.classes.local local) {
        this.local = local;
    }

    public Associacao.classes.professor getProfessor() {
        return professor;
    }

    public void setProfessor(Associacao.classes.professor professor) {
        this.professor = professor;
    }

    public aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

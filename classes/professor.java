package Associacao.classes;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class professor {
    private String nome;
    private String especialidade;
    private seminario[] seminarios;

    public professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public professor() {

    }

    public void print(){
        System.out.println("----------------------------");
        System.out.println("Nome Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios != null && seminarios.length != 0){
            for ( seminario sem : seminarios){
                System.out.println("Seminários Realizados: " + sem.getTitulo() + " ");

            }
            return;
        }
        System.out.println("professor em nenhum seminario");
    }
    public seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

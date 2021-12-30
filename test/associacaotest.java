package Associacao.test;

import Associacao.classes.aluno;
import Associacao.classes.local;
import Associacao.classes.professor;
import Associacao.classes.seminario;

public class associacaotest {
    public static void main(String[] args) {
    aluno alun = new aluno("Thiago ", 19);
    aluno alun2 = new aluno("Eduardo ", 40);

        seminario sem = new seminario("Programador");
        professor prof = new professor("Elias","JAVA");
        local local = new local("São Paulo, ","Vila linda");

        alun.setSeminario(sem);
        alun2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new aluno[]{alun,alun2});

        seminario[] semArray = new seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();



    }
}

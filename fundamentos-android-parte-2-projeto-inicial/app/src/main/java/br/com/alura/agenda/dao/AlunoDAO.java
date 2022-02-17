package br.com.alura.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.agenda.model.Aluno;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();
    private static int contadorDeIds = 1;

    public void salva(Aluno aluno) {
        aluno.setId(contadorDeIds);
        alunos.add(aluno);
        contadorDeIds++;
    }

    public void edita(Aluno aluno) {
        Aluno alunEoncontrado = null;
        for (Aluno a :
                alunos) {
            if (a.getId() == aluno.getId()) {
                alunEoncontrado = a;
            }
            if (alunEoncontrado != null) {
                int posicaoDoAluno = alunos.indexOf(alunEoncontrado);
                alunos.set(posicaoDoAluno, aluno);
            }
        }
    }


    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}

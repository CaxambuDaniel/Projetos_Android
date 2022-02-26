package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunoDeTeste();

    }

    private void criaAlunoDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Daniel","11233334444","daniel@bigbig.com"));
        dao.salva(new Aluno("Boga","11233334444","daniel@bigbig.com"));
    }
}

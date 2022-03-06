package alura.com.aluraviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import alura.com.aluraviagens.R;
import alura.com.aluraviagens.dao.PacoteDAO;
import alura.com.aluraviagens.model.Pacote;
import alura.com.aluraviagens.ui.adapter.ListaPoacotesAdapter;

public class ListaPacotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listView);

        List<Pacote> pacotes = new PacoteDAO().lista();

        listaDePacotes.setAdapter(new ListaPoacotesAdapter(pacotes, this));
    }
}
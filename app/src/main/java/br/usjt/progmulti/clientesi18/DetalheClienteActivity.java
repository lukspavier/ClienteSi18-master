package br.usjt.progmulti.clientesi18;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class DetalheClienteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        TextView nome = (TextView)findViewById(R.id.nome_selecionado);
        Intent intent = getIntent();
        nome.setText(intent.getStringExtra(ListaClientesActivity.NOME));
    }
}

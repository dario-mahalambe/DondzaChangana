package dario.mahalambe.xangana.activities;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import dario.mahalambe.xangana.Modelo.Xangana;
import dario.mahalambe.xangana.R;

public class LearnActivity extends AppCompatActivity {
    private static final String CHAVE = "nome";
    private Toolbar my_toolbar;
   private Xangana palavra_xangana1;
   private Xangana palavra_xangana2;
    private Xangana palavra_xangana3;
    private Xangana palavra_xangana4;
    private Xangana palavra_xangana5;

    private Xangana palavra_xangana6;

    static int imagemCurrente = 0;
    private TextView tv_xangana_perg;
//    private  TextView tv_xangana_resp;

    private MediaPlayer mp;

    private ArrayList<Xangana> palavras_xanganas = new ArrayList<Xangana>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        Intent intent = getIntent();


        tv_xangana_perg = (TextView) findViewById(R.id.tv_saud_xangana_perg);
//        tv_xangana_resp = (TextView) findViewById(R.id.tv_saud_xangana_resp);


        my_toolbar = (Toolbar) findViewById(R.id.my_toolbar_learn);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(intent.getStringExtra(CHAVE));


        palavra_xangana1 = new Xangana(0, "Hoyohóyo! (Bem Vindo!)", " ", R.raw.bemvindo);
        palavra_xangana2 = new Xangana(0, "Áwuxéni! (Bom Dia!)"," ", R.raw.awxeni);
        palavra_xangana3 = new Xangana(0, "Áwupéléni! (Boa Tarde!)"," ", R.raw.awupelini);
        palavra_xangana4 = new Xangana(0, "Ho yine? (Como está?)"," ", R.raw.comoesta);
        palavra_xangana5 = new Xangana(0, "Ha hanya. (Estou bem.)"," ", R.raw.hahanya);
        palavra_xangana6 = new Xangana(0, "Khanimambo. (Obrigado.)"," ", R.raw.obrigado);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);

        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);

        tv_xangana_perg.setText(palavras_xanganas.get(0).getNome_Xangana());
//        tv_xangana_resp.setText(palavras_xanganas.get(0).getNome_Portugues());
        mp = MediaPlayer.create(this, palavras_xanganas.get(0).getSound());

    }


    public void onProximo(View view) {


        imagemCurrente++;
        if(imagemCurrente==palavras_xanganas.size())
            imagemCurrente=0;
        tv_xangana_perg.setText(palavras_xanganas.get(imagemCurrente).getNome_Xangana());
//        tv_xangana_resp.setText(palavras_xanganas.get(imagemCurrente).getNome_Portugues());

        mp = MediaPlayer.create(this, palavras_xanganas.get(imagemCurrente).getSound());
    }

    @Override
    protected void onStop() {
        super.onStop();

        imagemCurrente=0;
    }


    public void onAnterior(View view) {

        imagemCurrente--;
        imagemCurrente = (imagemCurrente + palavras_xanganas.size()) % palavras_xanganas.size();

        tv_xangana_perg.setText(palavras_xanganas.get(imagemCurrente).getNome_Xangana());
//        tv_xangana_resp.setText(palavras_xanganas.get(imagemCurrente).getNome_Portugues());

        mp = MediaPlayer.create(this, palavras_xanganas.get(imagemCurrente).getSound());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_apreender, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here

        int id = item.getItemId();
        if (id == android.R.id.home) {

            imagemCurrente=0;
            finish(); // close this activity and return to preview activity (if there is any)
        }


        if (id == R.id.my_action_tip) {
            Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), R.string.informacao_tap_pron, Snackbar.LENGTH_LONG);
            View view = snackbar.getView();
            TextView tv = (TextView) view.findViewById(android.support.design.R.id.snackbar_text);
            tv.setTextColor(Color.WHITE);
            snackbar.show();
        }


        return super.onOptionsItemSelected(item);
    }

    public void onSom(View view) {


        mp.start();

    }
}

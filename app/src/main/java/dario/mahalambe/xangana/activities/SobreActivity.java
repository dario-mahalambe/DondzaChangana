package dario.mahalambe.xangana.activities;

import android.content.Intent;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import dario.mahalambe.xangana.R;
import dario.mahalambe.xangana.VersionActivity;

public class SobreActivity extends AppCompatActivity {

    private Toolbar my_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        my_toolbar = (Toolbar) findViewById(R.id.my_toolbar_sobre);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle(getString(R.string.sobre_titulo));


    }

    public void onSobre(View view)

    {

        LayoutInflater inflater = this.getLayoutInflater();


        AlertDialog.Builder builder =
                new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);
        builder.setTitle("Sobre");
        builder.setView(inflater.inflate(R.layout.sobre_dialog, null));
        builder.setPositiveButton("FECHAR", null);
        // builder.setMessage(R.string.sobre);


        builder.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here

        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }


    public void onTermos(View view) {


        WebView content = (WebView) LayoutInflater.from(this).inflate(R.layout.layout_web_licenca, null);
        content.loadUrl("https://api.backendless.com/FEE14788-7CB6-42BA-FF98-E8B3F9600D00/v1/files/web/term.html");
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this, R.style.Theme_AppCompat_Light_Dialog_Alert);
        builder.setTitle(getString(R.string.termos));
        builder.setView(content);

        builder.setPositiveButton(getString(R.string.dialog_fechar), null);
        builder.show();
    }

    public void onVersao(View view) {

        Intent intent = new Intent(this, VersionActivity.class);
        startActivity(intent);
    }
}

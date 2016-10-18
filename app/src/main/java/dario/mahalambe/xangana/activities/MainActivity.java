package dario.mahalambe.xangana.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;


import java.math.BigInteger;
import java.util.List;

import dario.mahalambe.xangana.R;
import googleAnalytics.AnalyticsApplication;

public class MainActivity extends AppCompatActivity {
    private Toolbar my_toolbar;

    private TextView tv_nome;
    private TextView tv_objecto;
    private TextView tv_pronomes;
    private TextView tv_verbos;
    private TextView tv_partes_corpo;
    private TextView tv_casa;
    private TextView tv_alimentos;
    private TextView tv_natureza;
    private TextView tv_locais;
    private TextView tv_animais;
    private TextView tv_transporte;
    private CardView cv_nome;
    private CardView cv_objectos;
    private CardView cv_pronomes;
    private CardView cv_casa;
    private CardView cv_verbos;
    private CardView cv_animais;
    private CardView cv_alimentos;
    private CardView cv_transporte;
    private CardView cv_natureza;
    private CardView cv_locais;
    private CardView cv_corpo;
    private CardView cv_saudacoes;

    private TextView tv_saudacaoes;

    private MediaPlayer mp;
    private BigInteger pageId = new BigInteger("1422454464437654");

    private Vibrator vibrator;
    public static String FACEBOOK_URL = "https://www.facebook.com/dondzachangana/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AnalyticsApplication) getApplication()).startTracking();



        tv_nome = (TextView) findViewById(R.id.tv_nomes);

        cv_alimentos = (CardView) findViewById(R.id.cv_alimento);
        cv_animais = (CardView) findViewById(R.id.cv_animais);
        cv_casa = (CardView) findViewById(R.id.cv_casa);

        cv_corpo = (CardView) findViewById(R.id.cv_corpo);
        cv_locais = (CardView) findViewById(R.id.cv_local);
        cv_transporte = (CardView) findViewById(R.id.cv_transporte);

        cv_objectos = (CardView) findViewById(R.id.cv_objecto);
        cv_verbos = (CardView) findViewById(R.id.cv_verbos);
        cv_pronomes = (CardView) findViewById(R.id.cv_pronomes);

        cv_natureza = (CardView) findViewById(R.id.cv_natureza);
        cv_nome = (CardView) findViewById(R.id.cv_nomes);
        cv_saudacoes = (CardView) findViewById(R.id.cv_saudacoes);


        cv_nome.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.mavito);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_nome.startAnimation(animation);
                return true;
            }
        });


        cv_objectos.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.objectos);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_objectos.startAnimation(animation);
                return true;
            }
        });


        cv_pronomes.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.silencio);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_pronomes.startAnimation(animation);
                return true;
            }
        });


        cv_verbos.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.verbos);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_verbos.startAnimation(animation);
                return true;
            }
        });


        cv_casa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.casa);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_casa.startAnimation(animation);
                return true;
            }
        });


        cv_corpo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.partescorpo);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_corpo.startAnimation(animation);
                return true;
            }
        });


        cv_alimentos.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.alimentos);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_alimentos.startAnimation(animation);
                return true;
            }
        });
        cv_transporte.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.transporte);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_transporte.startAnimation(animation);
                return true;
            }
        });
        cv_natureza.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.natureza);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_natureza.startAnimation(animation);
                return true;
            }
        });
        cv_locais.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.locais);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_locais.startAnimation(animation);
                return true;
            }
        });
        cv_animais.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.animais);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_animais.startAnimation(animation);
                return true;
            }
        });


        cv_saudacoes.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                mp = MediaPlayer.create(getApplicationContext(), R.raw.saudacoes);
                mp.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(20);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                cv_saudacoes.startAnimation(animation);
                return true;
            }
        });




        tv_objecto = (TextView) findViewById(R.id.tv_objecto);
        tv_pronomes = (TextView) findViewById(R.id.tv_pronomes);
        tv_verbos = (TextView) findViewById(R.id.tv_verbos);
        tv_partes_corpo = (TextView) findViewById(R.id.tv_corpo);
        tv_casa = (TextView) findViewById(R.id.tv_casa);
        tv_alimentos = (TextView) findViewById(R.id.tv_alimento);
        tv_transporte = (TextView) findViewById(R.id.tv_transporte);
        tv_natureza = (TextView) findViewById(R.id.tv_natureza);
        tv_locais = (TextView) findViewById(R.id.tv_local);
        tv_animais = (TextView) findViewById(R.id.tv_animais);

        tv_saudacaoes = (TextView) findViewById(R.id.tv_saudacaoes);

        my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        my_toolbar.setTitle(R.string.app_name);


    }

    private static final String CHAVE = "nome";


    public void onAprender(View view) {
        Intent intent = new Intent(MainActivity.this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_nome.getText().toString());
        startActivity(intent);

    }

    public void onPronomes(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_pronomes.getText().toString());
        startActivity(intent);

    }

    public void onVerbos(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_verbos.getText().toString());
        startActivity(intent);
    }

    public void onCorpo(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_partes_corpo.getText().toString());
        startActivity(intent);
    }


    public void onAnimal(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_animais.getText().toString());
        startActivity(intent);
    }

    public void onObjecto(View view) {

        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_objecto.getText().toString());
        startActivity(intent);
    }

    public void onCasa(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_casa.getText().toString());
        startActivity(intent);
    }

    public void onAlimentos(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_alimentos.getText().toString());
        startActivity(intent);
    }

    public void onTransporte(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_transporte.getText().toString());
        startActivity(intent);
    }

    public void onNatureza(View view) {

        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_natureza.getText().toString());
        startActivity(intent);
    }

    public void onLocais(View view) {
        Intent intent = new Intent(this, AprenderActivity.class);
        intent.putExtra(CHAVE, tv_locais.getText().toString());
        startActivity(intent);
    }

    public void onSaudacoes(View view) {
        Intent intent = new Intent(this, LearnActivity.class);
        intent.putExtra(CHAVE, tv_saudacaoes.getText().toString());
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent intent = new Intent(this, SobreActivity.class);
            startActivity(intent);
        }


        if (id == R.id.action_feedback) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                    Uri.fromParts("mailto", "dondzachangana@gmail.com", null));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,  getString(R.string.feedback));

            startActivityForResult(emailIntent, 1);


        }
        if (id == R.id.action_like) {
            try {
                launchFacebook();
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }


        }

        return super.onOptionsItemSelected(item);
    }

    public final void launchFacebook() throws PackageManager.NameNotFoundException {
        final String urlFb = FACEBOOK_URL + pageId;
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlFb));

        // If a Facebook app is installed, use it. Otherwise, launch
        // a browser
        final PackageManager packageManager = getPackageManager();
        List<ResolveInfo> list =
                packageManager.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        if (list.size() == 0) {
            packageManager.getPackageInfo("com.facebook.katana", 0);
            final String urlBrowser = FACEBOOK_URL + pageId;
            intent.setData(Uri.parse(urlBrowser));
        }

        startActivity(intent);
    }


    public void onShare(View view) {
        Intent share = new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Add data to the intent, the receiving app will decide
        // what to do with it.
        share.putExtra(Intent.EXTRA_SUBJECT, "Nomes em Changana");

        share.putExtra(Intent.EXTRA_TEXT, ""+ "Kokwana-Avô/Avó\n" + "Phoyisa-Polícia\n"+"Nghonyama-Leão\n"+ "Hoyohóyo-Bem vindo\n" + " \n" + "Eu estou aprendendo Changana com o Dondza Changana-App!\n" + "\n" + "Faça download para seu telefone Android:\n"  +
                "http://play.google.com/store/apps/details?id=" + this.getPackageName());

        startActivity(Intent.createChooser(share, "Partilhar Dondza Changana-App!"));
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, R.string.denovo_sair, Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

}

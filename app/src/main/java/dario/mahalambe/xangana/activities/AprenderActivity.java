package dario.mahalambe.xangana.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;

import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import dario.mahalambe.xangana.Modelo.Xangana;
import dario.mahalambe.xangana.R;
import googleAnalytics.AnalyticsApplication;

public class AprenderActivity extends AppCompatActivity {

    private ImageSwitcher my_imageView;

    private TextView tv_nome_xangana;
    private TextView tv_nome_portugues;

    private MediaPlayer mp;

    static int imagemCurrente = 0;
    Xangana palavra_xangana1;
    Xangana palavra_xangana2;

    Xangana palavra_xangana3;
    Xangana palavra_xangana4;
    Xangana palavra_xangana5;
    Xangana palavra_xangana6;
    Xangana palavra_xangana7;
    Xangana palavra_xangana8;
    Xangana palavra_xangana9;
    Xangana palavra_xangana10;
    Xangana palavra_xangana11;
    Xangana palavra_xangana12;
    Xangana palavra_xangana13;
    Xangana palavra_xangana14;
    Xangana palavra_xangana15;
    Xangana palavra_xangana16;
    Xangana palavra_xangana17;

    private ArrayList<Xangana> palavras_xanganas = new ArrayList<Xangana>();
    private Toolbar my_toolbar;

    private static final String CHAVE = "nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprender);

        ((AnalyticsApplication) getApplication()).startTracking();

        my_imageView = (ImageSwitcher) findViewById(R.id.my_imageView);

        tv_nome_xangana = (TextView) findViewById(R.id.tv_nome_xangana);
        tv_nome_portugues = (TextView) findViewById(R.id.tv_nome_portugues);


        Intent intent = getIntent();


        my_toolbar = (Toolbar) findViewById(R.id.my_toolbar_aprender);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(intent.getStringExtra(CHAVE));


        if (intent.getStringExtra(CHAVE).equalsIgnoreCase("nomes")) {
            categoria_Nomes();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("animais")) {
            categoria_Animal();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("alimentos")) {
            categoria_Alimentos();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("casa")) {
            categoria_Casa();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("partes do corpo")) {
            categoria_Corpo();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("locais")) {
            categoria_Locais();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("Natureza")) {
            categoria_Natureza();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("objectos")) {

            categoria_Objectos();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("Pronomes")) {
            categoria_Pronome();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("transporte")) {
            categoria_Transporte();

        } else if (intent.getStringExtra(CHAVE).equalsIgnoreCase("verbos")) {
            categoria_Verbos();
        }

        initializeImageSwitcher();

        Drawable dr = new BitmapDrawable(getResources(),decodeSampledBitmapFromResource(getResources(),palavras_xanganas.get(0).getImagem(),260,260));
        my_imageView.setImageDrawable(dr);
        tv_nome_portugues.setText("[" +palavras_xanganas.get(0).getNome_Portugues()+ "]");
        tv_nome_xangana.setText(palavras_xanganas.get(0).getNome_Xangana());
        mp = MediaPlayer.create(this, palavras_xanganas.get(0).getSound());

    }


    private void initializeImageSwitcher() {
        final ImageSwitcher imageSwitcher = (ImageSwitcher) findViewById(R.id.my_imageView);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(AprenderActivity.this);
                return imageView;
            }
        });

        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right));
    }

    public void categoria_Nomes() {

        palavra_xangana6 = new Xangana(R.drawable.policia, "Phóyisa", "Polícia", R.raw.policia);
        palavra_xangana1 = new Xangana(R.drawable.alfaiate, "Marzhungana ", "Alfaite", R.raw.alfaiate);
        palavra_xangana2 = new Xangana(R.drawable.vovo, "Kókwáná", "Avô/Avó", R.raw.avo);
        palavra_xangana5 = new Xangana(R.drawable.pai, "Tatáná", "Pai", R.raw.tatana);
        palavra_xangana3 = new Xangana(R.drawable.mae, "Mamana", "Mãe", R.raw.mamana);
        palavra_xangana9 = new Xangana(R.drawable.menino, "Mufána", "Rapaz", R.raw.rapaz);
        palavra_xangana4 = new Xangana(R.drawable.medico, "Dokodela", "Médico", R.raw.dokodela);
        palavra_xangana7 = new Xangana(R.drawable.prisioneiro, "Mubóhiwa", "Prisioneiro", R.raw.prisioneiro);
        palavra_xangana8 = new Xangana(R.drawable.professor, "Prisóri", "Professor", R.raw.professor);
        palavra_xangana10 =new Xangana(R.drawable.rei, "Hosi", "Rei", R.raw.rei);
        palavra_xangana11 =new Xangana(R.drawable.currandeiro, "N'yanga", "Médico Tradicional", R.raw.medicotradicional);
        palavra_xangana12 = new Xangana(R.drawable.menina, "Ntombhí", "Menina", R.raw.menina);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);
        palavras_xanganas.add(palavra_xangana9);
        palavras_xanganas.add(palavra_xangana12);
        palavras_xanganas.add(palavra_xangana10);

        palavras_xanganas.add(palavra_xangana11);


    }

    public void categoria_Animal() {

        palavra_xangana1 = new Xangana(R.drawable.boi, "Homu", "Boi", R.raw.boi);
        palavra_xangana2 = new Xangana(R.drawable.burro, "Mbongolo", "Burro", R.raw.burro);
        palavra_xangana3 = new Xangana(R.drawable.cobra, "Nyoka", "Cobra", R.raw.cobra);
        palavra_xangana4 = new Xangana(R.drawable.cabrito, "Mbuti", "Cabrito", R.raw.mbuti);
        palavra_xangana5 = new Xangana(R.drawable.galinha, "Huku", "Galinha", R.raw.galinha);
        palavra_xangana6 = new Xangana(R.drawable.gato, "Xipixi", "Gato", R.raw.gato);
        palavra_xangana7 = new Xangana(R.drawable.macaco, "Nfene", "Macaco", R.raw.macaco);
        palavra_xangana8 = new Xangana(R.drawable.mosquito, "Nsúná", "Mosquito", R.raw.mosquito);
        palavra_xangana9 = new Xangana(R.drawable.pato, "Sekwá", "Pato", R.raw.pato);
        palavra_xangana10 = new Xangana(R.drawable.peixe, "Hlampfi", "Peixe", R.raw.peixe);
        palavra_xangana11 = new Xangana(R.drawable.pombo, "Tuva", "Pombo", R.raw.pombo);
        palavra_xangana12 = new Xangana(R.drawable.rinoceronte, "Xibéjana", "Rinoceronte", R.raw.rinoceronte);
        palavra_xangana13 = new Xangana(R.drawable.tubarao, "Nyankwave", "Tubarão", R.raw.tubarao);

        palavra_xangana14 = new Xangana(R.drawable.formiga, "Nsókoti", "Formiga", R.raw.formiga);
        palavra_xangana15 = new Xangana(R.drawable.leao, "Nghonyama", "Leão", R.raw.leao);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);

        palavras_xanganas.add(palavra_xangana9);
        palavras_xanganas.add(palavra_xangana10);
        palavras_xanganas.add(palavra_xangana11);
        palavras_xanganas.add(palavra_xangana12);
        palavras_xanganas.add(palavra_xangana15);
        palavras_xanganas.add(palavra_xangana13);
        palavras_xanganas.add(palavra_xangana14);

    }

    public void categoria_Alimentos() {



        palavra_xangana1 = new Xangana(R.drawable.acucar, "Chukela", "Açucar", R.raw.acucar);
        palavra_xangana2 = new Xangana(R.drawable.agua, "Mati", "Água", R.raw.agua);
        palavra_xangana3 = new Xangana(R.drawable.amendoim, "Mazumana", "Amendoins", R.raw.amendoim);
        palavra_xangana4 = new Xangana(R.drawable.arroz, "Mpunga", "Arroz", R.raw.arroz);
        palavra_xangana5 = new Xangana(R.drawable.zambana, "Zambana", "Batata", R.raw.batata);
        palavra_xangana6 = new Xangana(R.drawable.bolo, "Xibundzwa", "Bolo", R.raw.bolo);
        palavra_xangana7 = new Xangana(R.drawable.cana, "Móva", "Cana-doce", R.raw.cana);
        palavra_xangana8 = new Xangana(R.drawable.cebola, "Nyala", "Cebola", R.raw.cebola);
        palavra_xangana9 = new Xangana(R.drawable.chocolate, "Xokoláti", "Chocolate", R.raw.chocolate);
        palavra_xangana10 = new Xangana(R.drawable.coco, "Khokho", "Coco", R.raw.coco);
        palavra_xangana11 = new Xangana(R.drawable.laranja, "D’in’wa", "Laranja", R.raw.laranja);
        palavra_xangana12 = new Xangana(R.drawable.limoes, "Bomu", "Limão", R.raw.limao);
        palavra_xangana13 = new Xangana(R.drawable.macaroca, "Xifáki", "Maçaroca", R.raw.macaroca);
        palavra_xangana14 = new Xangana(R.drawable.ovo, "Tandza", "Ovo", R.raw.ovo);
        palavra_xangana15 = new Xangana(R.drawable.pao, "Pawa", "Pão", R.raw.pao);
        palavra_xangana16 = new Xangana(R.drawable.rebucado, "Xindónsona", "Rebuçado", R.raw.xindonsana);
        palavra_xangana17 = new Xangana(R.drawable.repolho, "Rapoyi", "Repolho", R.raw.repolho);


        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);
        palavras_xanganas.add(palavra_xangana9);
        palavras_xanganas.add(palavra_xangana10);
        palavras_xanganas.add(palavra_xangana11);
        palavras_xanganas.add(palavra_xangana12);
        palavras_xanganas.add(palavra_xangana13);
        palavras_xanganas.add(palavra_xangana14);
        palavras_xanganas.add(palavra_xangana15);
        palavras_xanganas.add(palavra_xangana16);
        palavras_xanganas.add(palavra_xangana17);


    }

    public void categoria_Casa() {

        palavra_xangana1 = new Xangana(R.drawable.casa, "Yindlo", "Casa", R.raw.casa);
        palavra_xangana2 = new Xangana(R.drawable.chao, "Hansi", "Chão", R.raw.chao);
        palavra_xangana3 = new Xangana(R.drawable.garagem, "Garáxji", "Garagem", R.raw.garagem);
        palavra_xangana4 = new Xangana(R.drawable.grade, "Garáda", "Grade", R.raw.grade);
        palavra_xangana5 = new Xangana(R.drawable.janela, "Xjanela", "Janela", R.raw.janela);
        palavra_xangana6 = new Xangana(R.drawable.porta, "Xipfalu", "Porta", R.raw.porta);

        palavra_xangana7 = new Xangana(R.drawable.almofada, "Xiqámelo", "Almofada", R.raw.almofada);
        palavra_xangana8 = new Xangana(R.drawable.cadeira, "Xitsamu", "Cadeira", R.raw.cadeira);
        palavra_xangana9 = new Xangana(R.drawable.cama, "Mubédo", "Cama", R.raw.cama);
        palavra_xangana10 = new Xangana(R.drawable.espelho, "Xibn'uko", "Espelho", R.raw.espelho);
        palavra_xangana11 = new Xangana(R.drawable.gaveta, "Gavhéta", "Gaveta", R.raw.gavheta);
        palavra_xangana12 = new Xangana(R.drawable.jardim, "Xjaradi", "Jardim", R.raw.jardim);
        palavra_xangana13 = new Xangana(R.drawable.tapete, "Tapéti", "Tapete", R.raw.tapete);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);
        palavras_xanganas.add(palavra_xangana9);
        palavras_xanganas.add(palavra_xangana10);
        palavras_xanganas.add(palavra_xangana11);
        palavras_xanganas.add(palavra_xangana12);
        palavras_xanganas.add(palavra_xangana13);





    }

    public void categoria_Corpo() {



        palavra_xangana1 = new Xangana(R.drawable.carcaca, "Nhlókó", "Cabeça", R.raw.cabeca);
        palavra_xangana2 = new Xangana(R.drawable.barba, "Malepfu", "Barba", R.raw.barba);
        palavra_xangana3 = new Xangana(R.drawable.coracao, "Mbilo", "Coração", R.raw.coracao);
        palavra_xangana4 = new Xangana(R.drawable.corpo, "Miri", "Corpo", R.raw.corpo);
        palavra_xangana5 = new Xangana(R.drawable.dentes, "Matinho", "Dentes", R.raw.dentes);
        palavra_xangana6 = new Xangana(R.drawable.lingua, "Lirime", "Língua", R.raw.lingua);
        palavra_xangana7 = new Xangana(R.drawable.mao, "Vókó", "Mão", R.raw.mao);
        palavra_xangana8 = new Xangana(R.drawable.olhos, "Matíhló", "Olhos", R.raw.olhos);
        palavra_xangana9 = new Xangana(R.drawable.orelhas, "Tindleve", "Orelhas", R.raw.orelhas);
        palavra_xangana10 = new Xangana(R.drawable.pernas, "Nenge", "Perna", R.raw.perna);



        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);
        palavras_xanganas.add(palavra_xangana9);
        palavras_xanganas.add(palavra_xangana10);
    }

    public void categoria_Locais() {


        palavra_xangana1 = new Xangana(R.drawable.cidade, "Doropa", "Cidade", R.raw.cidade);
        palavra_xangana2 = new Xangana(R.drawable.bar, "B'angá", "Bar", R.raw.bar);
        palavra_xangana3 = new Xangana(R.drawable.escola, " Xikólo", "Escola", R.raw.escola);
        palavra_xangana4 = new Xangana(R.drawable.esquadra, "Xikwadru", "Esquadra", R.raw.xikwadru);
        palavra_xangana5 = new Xangana(R.drawable.hotel, "Wetélá", "Hotel", R.raw.hotel);
        palavra_xangana6 = new Xangana(R.drawable.loja, "Xitóló", "Loja", R.raw.loja);
        palavra_xangana7 = new Xangana(R.drawable.mercado, "Bazárá", "Mercado", R.raw.mercado);
        palavra_xangana8 = new Xangana(R.drawable.mercadoinformal, "Dumbánéngue", "Mercado Informal", R.raw.mercadoinformal);



        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);
    }

    public void categoria_Natureza() {

        palavra_xangana1 = new Xangana(R.drawable.ceu, "Tilo", "Céu", R.raw.ceu);
        palavra_xangana2 = new Xangana(R.drawable.capim, "Bzányin", "Capim", R.raw.capim);
        palavra_xangana3 = new Xangana(R.drawable.chuva, "Mpfúlá", "Chuva", R.raw.chuva);
        palavra_xangana4 = new Xangana(R.drawable.arvore, "Nsnya", "Arvore", R.raw.arvore);
        palavra_xangana5 = new Xangana(R.drawable.sol, "Jambu", "Sol", R.raw.jambo);
        palavra_xangana7 = new Xangana(R.drawable.rio, "Nambu", "Rio", R.raw.rio);
        palavra_xangana6 = new Xangana(R.drawable.montanha, "Ntava", "Montanha", R.raw.montanha);
        palavra_xangana8 = new Xangana(R.drawable.flor, "Xiluva", "Flor", R.raw.flor);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana7);

        palavras_xanganas.add(palavra_xangana8);

    }

    public void categoria_Objectos() {


        palavra_xangana1 = new Xangana(R.drawable.caixa, "Káxa", "Caixa", R.raw.caixa);
        palavra_xangana2 = new Xangana(R.drawable.chave, "Mpfungulo", "Chave", R.raw.chave);
        palavra_xangana3= new Xangana(R.drawable.carta, "Karita", "Carta de Jogar", R.raw.cartajogar);
        palavra_xangana4 = new Xangana(R.drawable.notas, "Male", "Dinheiro", R.raw.dinheiro);
        palavra_xangana5 = new Xangana(R.drawable.envilope, "Mvhilope", "Envilope", R.raw.envilope);
        palavra_xangana6 = new Xangana(R.drawable.faca, "Xikhwa", "Faca", R.raw.faca);
        palavra_xangana7 = new Xangana(R.drawable.fosforo, "Fófo", "Fósforo", R.raw.fosforo);
        palavra_xangana8 = new Xangana(R.drawable.geleira, "Xjelera", "Geleira", R.raw.geleira);
        palavra_xangana9= new Xangana(R.drawable.lapis, "Lápi ", "Lápis", R.raw.lapis);
        palavra_xangana10 = new Xangana(R.drawable.lata, "Xikotela", "Lata", R.raw.xikotela);
        palavra_xangana11 = new Xangana(R.drawable.livro, "Búko", "Livro", R.raw.livro);
        palavra_xangana12 = new Xangana(R.drawable.jornal, "Xjornáli", "Jornal", R.raw.jornal);
        palavra_xangana13 = new Xangana(R.drawable.prego, "Xipikiri", "Prego", R.raw.prego);
        palavra_xangana14= new Xangana(R.drawable.relogio, "Wáchi ", "Relógio", R.raw.relogio);
        palavra_xangana15 = new Xangana(R.drawable.telrvisor, "Thelevhizóri", "Televisor", R.raw.televisor);
        palavra_xangana16= new Xangana(R.drawable.toalha, "Thawula ", "Toalha", R.raw.toalha);
        palavra_xangana17= new Xangana(R.drawable.garafa, "Xigádzana", "Garafa", R.raw.xigadzana);



        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);

        palavras_xanganas.add(palavra_xangana9);
        palavras_xanganas.add(palavra_xangana10);
        palavras_xanganas.add(palavra_xangana11);
        palavras_xanganas.add(palavra_xangana12);
        palavras_xanganas.add(palavra_xangana13);
        palavras_xanganas.add(palavra_xangana14);
        palavras_xanganas.add(palavra_xangana15);
        palavras_xanganas.add(palavra_xangana16);

        palavras_xanganas.add(palavra_xangana17);




    }

    public void categoria_Pronome() {

        palavra_xangana1 = new Xangana(R.drawable.mina, "Mina", "Eu", R.raw.eu);
        palavra_xangana2 = new Xangana(R.drawable.tu, "Wena", "Tu", R.raw.wena);
        palavra_xangana3 = new Xangana(R.drawable.ele, "Yena", "Ele/Ela", R.raw.yena);
        palavra_xangana4 = new Xangana(R.drawable.hina, "Hina", "Nós", R.raw.hina);
        palavra_xangana5 = new Xangana(R.drawable.mwina, "N'wina", "Vós", R.raw.mwina);
        palavra_xangana6 = new Xangana(R.drawable.vona, "Vona", "Eles", R.raw.vona);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);

    }

    public void categoria_Transporte() {

        palavra_xangana1 = new Xangana(R.drawable.aviao, "Xjátu", "Avião", R.raw.aviao);
        palavra_xangana2 = new Xangana(R.drawable.barco, "Boti", "Barco", R.raw.boti);
        palavra_xangana3 = new Xangana(R.drawable.bicicleta, "Baskeni", "Bicicleta", R.raw.bicicleta);
        palavra_xangana4 = new Xangana(R.drawable.carro4, "Movha", "Carro", R.raw.carro);
        palavra_xangana5 = new Xangana(R.drawable.comboio, "Xitimela xa Ntlanva", "Comboio", R.raw.comboio);
        palavra_xangana6 = new Xangana(R.drawable.machimbombo, "Xibomba", "Machimbombo", R.raw.machimbombo);
        palavra_xangana7 = new Xangana(R.drawable.chapa, "Xapa", "MiniBus", R.raw.chapa);
        palavra_xangana8 = new Xangana(R.drawable.mota, "Xithuthuthu", "Mota", R.raw.mota);
        palavra_xangana9 = new Xangana(R.drawable.camiao, "Xipángwa", "Camião", R.raw.camiao);

        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);
        palavras_xanganas.add(palavra_xangana9);


    }

    public void categoria_Verbos() {


        palavra_xangana1= new Xangana(R.drawable.acordar, "Ku pfuka", "Acordar", R.raw.kupfuka);
        palavra_xangana2 = new Xangana(R.drawable.atrasar, "Ku xwela", "Atrasar", R.raw.kuswela);
        palavra_xangana3 = new Xangana(R.drawable.comer, "Kuda", "Comer", R.raw.comer);
        palavra_xangana4 = new Xangana(R.drawable.correr, "Ku tsutsuma", "Correr", R.raw.kutsutsuma);
        palavra_xangana5 = new Xangana(R.drawable.dar, "Ku nyika", "Dar", R.raw.kunyica);
        palavra_xangana6 = new Xangana(R.drawable.dormindo, "Ku yetlela", "Dormir", R.raw.kuyetlela);
        palavra_xangana7 = new Xangana(R.drawable.empurrar, "Ku chovha", "Empurrar", R.raw.kuchova);
        palavra_xangana8 = new Xangana(R.drawable.escrever, "Ku tsala", "Escrever", R.raw.kutsala);
        palavra_xangana9 = new Xangana(R.drawable.estudarr, "Ku dondza", "Estudar", R.raw.kujondza);
        palavra_xangana10 = new Xangana(R.drawable.falar, "Ku vúlavula", "Falar", R.raw.kuvulavula);
        palavra_xangana11 = new Xangana(R.drawable.pedir, "Ku kombela", "Pedir", R.raw.kukombela);
        palavra_xangana12 = new Xangana(R.drawable.sentar, "Ku tsama", "Sentar", R.raw.kutsama);
        palavra_xangana13 = new Xangana(R.drawable.telefonar, "Ku fona", "Telefonar", R.raw.kufona);
        palavra_xangana14 = new Xangana(R.drawable.temperar, "Ku kandzela", "Temperar", R.raw.kukandzela);



        palavras_xanganas.add(palavra_xangana1);
        palavras_xanganas.add(palavra_xangana2);
        palavras_xanganas.add(palavra_xangana3);
        palavras_xanganas.add(palavra_xangana4);
        palavras_xanganas.add(palavra_xangana5);
        palavras_xanganas.add(palavra_xangana6);
        palavras_xanganas.add(palavra_xangana7);
        palavras_xanganas.add(palavra_xangana8);
        palavras_xanganas.add(palavra_xangana9);
        palavras_xanganas.add(palavra_xangana10);
        palavras_xanganas.add(palavra_xangana11);
        palavras_xanganas.add(palavra_xangana12);
        palavras_xanganas.add(palavra_xangana13);
        palavras_xanganas.add(palavra_xangana14);
    }



    public void onProximo(View view) {


        imagemCurrente++;

          //  imagemCurrente = imagemCurrente % palavras_xanganas.size();
            if(imagemCurrente==palavras_xanganas.size())
            imagemCurrente=0;
            my_imageView.setImageResource(palavras_xanganas.get(imagemCurrente).getImagem());
            tv_nome_xangana.setText(palavras_xanganas.get(imagemCurrente).getNome_Xangana());
            tv_nome_portugues.setText("[" + palavras_xanganas.get(imagemCurrente).getNome_Portugues() + "]");
            mp = MediaPlayer.create(this, palavras_xanganas.get(imagemCurrente).getSound());


    }

    public void onAnterior(View view) {
        imagemCurrente--;
        imagemCurrente = (imagemCurrente + palavras_xanganas.size()) % palavras_xanganas.size();

      my_imageView.setImageResource(palavras_xanganas.get(imagemCurrente).getImagem());
        tv_nome_xangana.setText(palavras_xanganas.get(imagemCurrente).getNome_Xangana());
        tv_nome_portugues.setText("[" + palavras_xanganas.get(imagemCurrente).getNome_Portugues() + "]");

        mp = MediaPlayer.create(this, palavras_xanganas.get(imagemCurrente).getSound());
    }

    public void onPlaySound(View view) {

        mp.start();
    }


    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
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

    @Override
    protected void onStop() {
        super.onStop();

        imagemCurrente=0;
    }
}

package dario.mahalambe.xangana.Modelo;

/**
 * Created by user on 5/28/2016.
 */
public class Xangana {

    private  int imagem;
    private  String nome_Xangana;
    private String nome_Portugues;
    private  int sound;

    public Xangana(int imagem, String nome_Xangana, String nome_Portugues, int sound) {
        this.imagem = imagem;
        this.nome_Xangana = nome_Xangana;
        this.nome_Portugues = nome_Portugues;
        this.sound = sound;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome_Xangana() {
        return nome_Xangana;
    }

    public void setNome_Xangana(String nome_Xangana) {
        this.nome_Xangana = nome_Xangana;
    }

    public String getNome_Portugues() {
        return nome_Portugues;
    }

    public void setNome_Portugues(String nome_Portugues) {
        this.nome_Portugues = nome_Portugues;
    }


    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }
}

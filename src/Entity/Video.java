package Entity;

import Interfaccia.Riproducibile;
public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }
    @Override
    public void play() {
        String v = "";
        String l = "";

        for (int i = 0; i < volume; i++) {
            v += "!";
        }
        for (int i = 0; i < luminosita; i++) {
            l += "*";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(this.titolo + "" + v + "" + l);
        }
    }
    @Override
    public void esegui() {
        play();
    }
    public void alzaVolume() {
        this.volume++;
    }
    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }
    public void aumentaLuminosita() {
        this.luminosita++;
    }
    public void diminuisciLuminosita() {
        if (this.luminosita > 0) {
            this.luminosita--;
        }
    }
}

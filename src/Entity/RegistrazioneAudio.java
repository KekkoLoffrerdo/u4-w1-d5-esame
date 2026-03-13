package Entity;

import Interfaccia.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
    @Override
    public void play() {
        String v = "";
        for (int i = 0; i < volume; i++) v += "!";
        for (int i = 0; i < durata; i++) {
            System.out.println(this.titolo +  v);
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
}
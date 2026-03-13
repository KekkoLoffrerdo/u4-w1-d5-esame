package Entity;

public class Immagine extends ElementoMultimediale {
    private int luminosita;
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }
    public void show() {
        String l = "";

        for (int i = 0; i < luminosita; i++) {
            l += "*";
        }

        System.out.println(this.titolo + l);
    }
    @Override
    public void esegui() {
        show();
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
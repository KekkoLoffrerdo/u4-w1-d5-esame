import Entity.ElementoMultimediale;
import Entity.RegistrazioneAudio;
import Entity.Video;
import Entity.Immagine;

public class MainPlayer {
    public static void main(String[] args) {
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

       elementi[0] = new RegistrazioneAudio("Stelle", 3, 4);
        elementi[1] = new RegistrazioneAudio("Canzone D'amore", 2, 2);
        elementi[2] = new RegistrazioneAudio("Mai Più", 1, 5);
        elementi[3] = new Video("Film", 2, 3, 4);
        elementi[4] = new Immagine("Tramonto", 5);

        System.out.println(" Avvio ");
        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Esecuzione elemento " + (i + 1) + ":");

            elementi[i].esegui();
        }
    }
}

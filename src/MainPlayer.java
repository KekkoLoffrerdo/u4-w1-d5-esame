import Entità.*;

public class MainPlayer {
    public static void main(String[] args) {
        ElementoMultimediale[] canzone = new ElementoMultimediale[3];

       canzone[0] = new RegistrazioneAudio("Stelle", 3, 4);
        canzone[1] = new RegistrazioneAudio("Canzone D'amore", 2, 2);
        canzone[2] = new RegistrazioneAudio("Rap", 1, 5);


        System.out.println(" avvio canzone");
        for (int i = 0; i < canzone.length; i++) {
            System.out.println("Esecuzione elemento " + (i + 1) + ":");

            canzone[i].esegui();
        }
    }
}

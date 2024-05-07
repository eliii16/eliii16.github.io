import java.util.Random;

public class swe123 {

    public static void main(String[] args) {
        // Anzahl der Teilnehmer
        int anzahlTeilnehmer = 16;
        // Anzahl der Teilnehmer pro Gruppe
        int groesseGruppe = 3;

        Random random = new Random();

        // Zufällige Gruppenbildung
        for (int i = 1; i <= anzahlTeilnehmer; i++) {
            System.out.println("Person " + i + " ist in Gruppe " + (random.nextInt(anzahlTeilnehmer / groesseGruppe) + 1));
        }
    }
}

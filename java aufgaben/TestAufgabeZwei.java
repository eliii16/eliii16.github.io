import java.util.Random;
import java.util.Scanner;

public class TestAufgabeZwei {

    public static void main(String[] args) {
        // Erstellen eines neuen Random-Objekts
        Random r = new Random();
        // Generieren einer Zufallszahl zwischen 1 und 100 (einschließlich 1, aber ausschließlich 100)
        int z = r.nextInt(99) + 1;
        // Initialisierung der Versuchsnummer und des maximalen Versuchsanzahls
        int i = 1, max = 8;
        // Variable zur Steuerung des Spiels
        boolean spiel = true;
        // String für verschiedene Nachrichten je nach Anzahl der Versuche
        String a = "";
        
        // Begrüßungsnachricht und Aufforderung zur Eingabe einer Zahl
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 100 ein!");
        
        // Schleife für das Spiel
        while (spiel) {
            // Prüfen, ob die Anzahl der Versuche noch innerhalb des Maximums liegt
            if (i < max) {
                // Erstellen eines neuen Scanner-Objekts zur Eingabe
                Scanner scan = new Scanner(System.in);
                // Ausgabe der aktuellen Versuchsnummer
                System.out.println(i + ". Versuch: ");
                // Einlesen der vom Benutzer eingegebenen Zahl
                int e = scan.nextInt();
                // Überprüfen, ob die eingegebene Zahl kleiner, größer oder gleich der Zufallszahl ist
                if (e < z) {
                    System.out.println("Ihre Eingabe ist zu klein.");
                } else if (e > z) {
                    System.out.println("Ihre Eingabe ist zu gross");
                } else { // Wenn die eingegebene Zahl gleich der Zufallszahl ist
                    // Auswahl einer Nachricht basierend auf der Anzahl der Versuche
                    switch (i) {
                        case 1:
                            a = "Moino!";
                            break;
                        case 2:
                            a = "WAAAASSS!";
                            break;
                        case 3:
                        case 4:
                            a = "Was geht ab!";
                            break;
                        case 5:
                        case 6:
                            a = "Meh!";
                            break;
                        case 7:
                            a = "Bahh!";
                            break;
                    }
                    // Ausgabe einer Erfolgsmeldung
                    if (i < 2)
                        System.out.println(a + "Sie haben nur " + i + "Versuch gebraucht.");
                    else
                        System.out.println(a + "Sie haben " + i + "Versuche gebraucht.");

                    // Beenden des Spiels
                    spiel = false;
                }
            } else { // Wenn die maximale Anzahl der Versuche erreicht wurde
                // Beenden des Spiels und Ausgabe einer Nachricht
                spiel = false;
                System.out.println("Sie haben es nicht geschafft. Das Spiel wurde abgebrochen");
            }
            // Inkrementieren der Versuchsnummer
            i++;
        }
    }
}

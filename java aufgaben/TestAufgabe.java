import java.util.Scanner;
 
public class TestAufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Geben Sie die Punktzahl von 0 bis 100 ein:");
        int punktzahl = scanner.nextInt();
 
        char note = berechneNote(punktzahl);
 
        System.out.println("Die Schulnote lautet: " + note);
 
        scanner.close();
    }
 
 
    public static char berechneNote(int punktzahl) {
        if (punktzahl >= 92 && punktzahl <= 100) {
            return '1';
        } else if (punktzahl >= 81 && punktzahl <= 91) {
            return '2';
        } else if (punktzahl >= 67 && punktzahl <= 80) {
            return '3';
        } else if (punktzahl >= 50 && punktzahl <= 66) {
            return '4';
        } else if (punktzahl >= 31 && punktzahl <= 49) {
            return '5';
        } else if (punktzahl >= 0 && punktzahl <= 30) {
            return '6';
        } else {
            return 'U'; // U für ungültig
        }
    }
}


public class doublearay {
    

public static void main(String[] args) {
    
/* Legen Sie ein double-Array  „sparbuch“ an und weisen Sie die Werte zu. 
Testen Sie zwei verschiedene Möglichkeiten der Wertzuweisung:
- new … + Initialisierung im Konstruktor;
- direkte Initialisierung {…} bei der Deklarierung
*/

        double[] sparbuch = new double[3]; 
        sparbuch[0] = 1000.50; 
        sparbuch[1] = 2000.75; 
        sparbuch[2] = 3000.25; 

        
        System.out.println("Werte im Sparbuch (mit 'new' und Initialisierung im Konstruktor):");
        for (int i = 0; i < sparbuch.length; i++) {
            System.out.println("Sparbuch[" + i + "]: " + sparbuch[i]);
        }
    }
}
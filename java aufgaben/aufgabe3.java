import java.util.Random;
public class aufgabe3 {

/*
3. Aufgabe
Erstellen Sie ein Java-Programm, bei dem eine Münze geworfen wird.
Man gewinnt, wenn dreimal hintereinander entweder Zahl oder Kopf geworfen wurde.
Es soll ausgegeben werden, wie oft die Münze geworfen wurde!
*/

public static void main(String[] args) {
boolean win = false; // Bei gewonnen auf true
Random r = new Random();
int x = 1; // Etweder 0 gleich Zahl oder 1 gleich Bild 
int z = 1; // Anzahl der Würfe // Wird am ende hochgezählt 
int bild = 0; // Anzahl, wie oft Bild hintereinander geworfen wurde
int zahl = 0; // Anzahl, wie oft Bild hintereinander geworfen wurde
while(!win){
    x = r.nextInt(2);
    System.out.println(z + ". Wurf:");
    if ( x== 0)  System.out.println("Zahl");
    else  System.out.println("Bild");
    if (x== 0){zahl ++; bild = 0; }
    else {bild++; zahl = 0 ; }
    if (bild > 2 || zahl > 2) win = true;
    z++;
} //while
    System.out.println("Es wurde " +(z-1) + "Mal die Münze geworfen!");
}// main

}//public class aufgabe3 

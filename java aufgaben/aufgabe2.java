public class aufgabe2 {
    

/*2. Aufgabe
Erstellen Sie ein Java-Programm, dass eine Schleife von von -20 bis 200 durchläuft und 
alle geraden Zahlen addiert und das Ergebnis ausgibt.
*/

public static void main(String[] args) {
    int e = 0; // Variable zur Speicherung des Ergebnisses
    for(int i = -20; i < 201; i++){  // Schleife von -20 bis 200
    if (i % 2 == 0){// Ob die Zahl i durch teilbar ist
    e = e + i; // Addition der geraden Zahl zum Ergebnis
System.out.println(e);
   
     
   }

  }
}
}

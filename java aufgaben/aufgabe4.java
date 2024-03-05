import java.util.Random;
public class aufgabe4 {

/*
erstelle ein java-programm,dass solange eine Zufallszahl zwischen 1 und 6 erzeugt
bis eine 6 gezogen wurde.
addieren sie alle geeworfene zahlen.
1,4,5,6=16
2,6=8
3,5,5,3,2,5,6=29
*/

public static void main(String[] args) {
    Random r = new Random();
    int summe = 0 ; 
    int wurf = 1;
    do {
 wurf= r.nextInt(6) +1; // Generiert eine Zufallszahl zwischen 1 und 6 (inklusive)
 System.out.println("du hast eine '" + wurf +"' gewürfelt!"); //Gibt die gewürfelte Zahl aus
 summe +=wurf; // Addiert die gewürfelte Zahl zur Gesamtsumme hinzu
    }while(wurf!=6); // Die Schleife wird fortgesetzt, solange keine 6 gewürfelt wurde

    System.out.println("Das ergebnis ist:" + summe); // Gibt die Gesamtsumme aus
}//main
} //public class aufgabe4 



    
        


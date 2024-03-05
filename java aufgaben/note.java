import java.util.Scanner;

public class note {
  
  /*  1. Aufgabe
    Erstellen Sie ein Java-Programm, in dem man die Punktzahl von 0 bis 100 Punkte eingibt. 
    Es soll dann eine Schulnote ausgeben werden:
    1: 100 - 92
    2: 91 - 81
    3: 80 - 67
    4: 66 - 50
    5: 49 - 31
    6: 0  - 30
    */
    
    public static void main(String[] args) {
        int note; // 0- 100
       
        System.out.println("Geben sie eine Punktzahl zwischen 0 und 100 ein");
        Scanner sc = new  Scanner (System.in);
        note= sc.nextInt();

        String s= "";
        if (note > 91) s = "sehr gut";
        else if (note > 80) s= "gut";
        else if (note > 66) s= "befriedingend";
        else if (note > 49) s= "ausreichend";
        else if (note > 30) s= "mangelhaft";
        else s ="ungenügend";

        System.out.println("Ihre Note ist " + s + "!");

    } // main 
} //public class note
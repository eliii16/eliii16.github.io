import java.util.Scanner;
import java.util.Random;
public class Spiel {
/**
 * @param args
 */
public static void main(String[] args) {
Random r = new Random();
int z = r.nextInt(99) + 1;
int i = 1, max = 8;
boolean spiel = true;
String a ="";
System.out.println("Geben Sie bitte eine Zahl zwischen 1 und 100 ein:" + z ) ;
while(spiel) {
    if( i < max) {
        Scanner scan = new Scanner(System.in);
        System.out.println(i + ". Versuch: ");
        int e = scan.nextInt();
        if  (e > z) {
            System.out.println("ihre Eingabeist zu klein");
        }else if  (e > z) {
            System.out.println("ihre Eingabeist zu groß");
        }else{
            switch(i) {
                case 1: a= "Super!"; break;
                case 2: a= "Klasse!"; break;
                case 3: 
                case 4: a= "Cool!"; break;
                case 5:
                case 6: a= "Gut!"; break;
                case 7: a= "Na ja!"; break;
            } // else von switch
            if (i < 2)
            System.out.println(a + "Sie haben nur " + i + " Versuch gebraucht ");
            else
            System.out.println(a + "Sie haben  " + i + " Versuch gebraucht ");
            spiel = false;
        }
    }else{
        spiel= false;
        System.out.println("Sie haben es nicht geschafft. Das Spiel wurde abgebrochen! ");
    }
    i++;
}   //while für das spiel
}  // main
} // class Zufall
                


public class arays {
    


public static void main(String[] args) {
int [] zahlen = new int [3];
zahlen [0] = 12;
zahlen [1] = 99;
zahlen [2] = 5;
zahlen [3] = 50;
/* 
System.out.println("In der ersten Schublade liegt das " + zahlen[0] );
System.out.println("In der ersten Schublade liegt das " + zahlen[1] );
System.out.println("In der ersten Schublade liegt das " + zahlen[2] );
System.out.println("In der ersten Schublade liegt das " + zahlen[2] );
System.out.println("In der ersten Schublade liegt das " + zahlen[3] );
*/

System.out.println("Anzahl der Elmente: "+ zahlen.length );
for ( int i = 0; i < zahlen.length; i++ ){
    System.out.println("In der  "+ (i+1)   + ". Schublade liegt die " + zahlen[i] );


// Andersherum
for ( int i = zahlen.length - 1; i >=0;  i-- ){
    System.out.println("In der  "+ (i+1)   + ". Schublade liegt die " + zahlen[i] );

/*
Arays kürzer schreiben:
int [z] = {10,100,1000}; 
for( int x: z )

*/
  






}//forSchleife2
}//forSchleife1
}//main
}//Arays
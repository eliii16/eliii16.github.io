
public class SWE {


public static void main ( String[] args){

int [] ertseListe ={1,5,7,9,11};
int [] zweiteListe ={2,7,6,5,5};

//for( intialiesierung, Bedigung, Inkremet)
	for (int i= 0; i< 5; i++) {
		int zahl1= ertseListe[i];
		
		for (int j= 0; j< 5; j++) {
		int zahl1 = ertseListe[i];
		int zahl2 = zweiteListe[j];
		if ( zahl1 == zahl2){
			System.out.println("Gleiche Zahl: "+zahl1);
			break;
		}
		}
	}
}
}



	
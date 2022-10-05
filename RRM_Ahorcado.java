import java.util.Scanner;

class RRM_Ahorcado {

	public static void main(String[] args) {
	//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sPalabra;		
		char cLetra;			
		int iFallos=0, iAciertos=0;		
		String sSolucion="";
		boolean bFallo=true;	
		String sFallos="", sAciertos="";
		String sTmp="";			

	//Inicio
		System.out.println("Introduce una palabra para jugar: ");
		sPalabra=sc.next().toUpperCase(); 


		System.out.println("La palabra tiene " +sPalabra.length()+ " letras");


	//Formateamos salida solución
		for(int i=1; i<=sPalabra.length(); i++) {				
			sSolucion=sSolucion+"_";
			System.out.print(sSolucion);						
		}

	//Iniciamos juego
		System.out.println("*** COMENZAMOS ***");

		do {
			System.out.println("Fallos: "+sFallos+" -->  "+sSolucion+" <-- Introduce una letra");
			cLetra=(sc.next().charAt(0)+"").toUpperCase().charAt(0);

		bFallo=true;
		for(int i=0; i<sPalabra.length() ;i++) {
			System.out.println(cLetra);	

			if (sPalabra.charAt(i)==cLetra) {					
				bFallo=false;
				sTmp+=cLetra;

			} else {
					sTmp+=sSolucion.charAt(i);
				
			}

		}//for

		sSolucion=sTmp;
		sTmp="";


		if (bFallo){
			iFallos++;
			sFallos=sFallos+cLetra+"-";   
		} else {
			iAciertos++;
			sAciertos=sAciertos+cLetra+"-";
		}

		System.out.println("\nFallos:"+iFallos);
		System.out.println("\nAciertos:"+iAciertos);		

		switch (iFallos) { 
			case 0:                 
				System.out.println(" ---------------------");                 
				for (int j = 0; j <15; j++) {                     
					System.out.println(" |");                  
				 }                 
				System.out.println("__________");                 
				break; 

			case 1:                 
				System.out.println(" ---------------------");                 
				System.out.println(" |                     |");                 
				System.out.println(" |                     |");                 
				System.out.println(" |                  -------");                 
				System.out.println(" |                 | -  -  |");                 
				System.out.println(" |                 |   o   |");                 
				System.out.println(" |                  -------");                 
				for (int j = 0; j < 10; j++) {                     
					System.out.println(" |");                   
				}                 
				System.out.println("__________");                 
				break; 

			case 2:                 
				System.out.println(" ---------------------");                 
				System.out.println(" |                     |");                 
				System.out.println(" |                     |");                
				System.out.println(" |                  -------");                 
				System.out.println(" |                 | -  -  |");                 
				System.out.println(" |                 |   o   |");                 
				System.out.println(" |                  -------");                 
				System.out.println(" |                     |   ");                 
				System.out.println(" |                     |   ");                 
				System.out.println(" |                     |   "); 
		        System.out.println(" |                     |   ");                 
		        System.out.println(" |                     |   ");                 
		        for (int j = 0; j < 5; j++) {                     
		            System.out.println(" |");                   
		        }                 
		        System.out.println("__________");                 
		        break;   


	        case 3:                 
				System.out.println(" ---------------------");                 
				System.out.println(" |                     |");                 
				System.out.println(" |                     |");                
				System.out.println(" |                  -------");                 
				System.out.println(" |                 | -  -  |");                 
				System.out.println(" |                 |   o   |");                 
				System.out.println(" |                  -------");                 
				System.out.println(" |                     |   ");                 
				System.out.println(" |                   / |   ");                 
				System.out.println(" |                  /  |   "); 
		        System.out.println(" |                 /   |   ");                 
		        System.out.println(" |                     |   ");                 
		        for (int j = 0; j < 5; j++) {                     
		            System.out.println(" |");                   
		        }                 
		        System.out.println("__________");                 
		        break;   

	        case 4:                 
				System.out.println(" ---------------------");                 
				System.out.println(" |                     |");                 
				System.out.println(" |                     |");                
				System.out.println(" |                  -------");                 
				System.out.println(" |                 | -  -  |");                 
				System.out.println(" |                 |   o   |");                 
				System.out.println(" |                  -------");                 
				System.out.println(" |                     |   ");                 
				System.out.println(" |                   / | \\   ");                 
				System.out.println(" |                  /  |  \\  "); 
		        System.out.println(" |                 /   |   \\ ");                 
		        System.out.println(" |                     |   ");                     
		        for (int j = 0; j < 5; j++) {                     
		            System.out.println(" |");                   
		        }                 
		        System.out.println("__________");                 
		        break;   

	        case 5:                 
				System.out.println(" ---------------------");                 
				System.out.println(" |                     |");                 
				System.out.println(" |                     |");                
				System.out.println(" |                  -------");                 
				System.out.println(" |                 | -  -  |");                 
				System.out.println(" |                 |   o   |");                 
				System.out.println(" |                  -------");                 
				System.out.println(" |                     |   ");                 
				System.out.println(" |                   / | \\   ");                 
				System.out.println(" |                  /  |  \\  "); 
		        System.out.println(" |                 /   |   \\ ");                 
		        System.out.println(" |                     |   ");   
		        System.out.println(" |                    /  "); 
		        System.out.println(" |                   /      ");   
		        System.out.println(" |                  /       ");              
		        for (int j = 0; j < 2; j++) {                     
		            System.out.println(" |");                   
		        }                 
		        System.out.println("__________");                 
		        break;   

	        case 6:                 
				System.out.println(" ---------------------");                 
				System.out.println(" |                     |");                 
				System.out.println(" |                     |");                
				System.out.println(" |                  -------");                 
				System.out.println(" |                 | x  x  |");                 
				System.out.println(" |                 |   o   |");                 
				System.out.println(" |                  -------");                 
				System.out.println(" |                     |   ");                 
				System.out.println(" |                   / | \\   ");                 
				System.out.println(" |                  /  |  \\  "); 
		        System.out.println(" |                 /   |   \\ ");                
		        System.out.println(" |                     |   ");   
		        System.out.println(" |                    / \\"); 
		        System.out.println(" |                   /   \\  ");  
		       	System.out.println(" |                  /     \\ ");  

		        for (int j = 0; j < 2; j++) {                     
		            System.out.println(" |");                   
		        }                 
                 
		        break;
		           
		       }


		} while (iFallos<=6 && !sPalabra.equals(sSolucion)); 

		System.out.println("\nPalabra:" +sPalabra);

			System.out.println("  _____          __  __ ______    ______      ________ _____  ");
			System.out.println(" / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\ " );
			System.out.println("| |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__ | |__) | ");
			System.out.println("| | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  / ");
			System.out.println("| |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\ ");
			System.out.println(" \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_\\ ");

		if (sPalabra.equals(sSolucion)) {

			System.out.println("______________________________________________________________________");
			System.out.println("______________________________________________________________________");

			System.out.println("| |  | |   /\\    / ____|  / ____|   /\\   | \\ | |   /\\   |  __ \\ / __ \\ ");
			System.out.println("| |__| |  /  \\  | (___   | |  __   /  \\  |  \\| |  /  \\  | |  | | |  | | ");
			System.out.println("|  __  | / /\\ \\  \\___ \\  | | |_ | / /\\ \\ | . ` | / /\\ \\ | |  | | |  | |");
			System.out.println("| |  | |/ ____ \\ ____) | | |__| |/ ____ \\| |\\  |/ ____ \\| |__| | |__| |");
			System.out.println("|_|  |_/_/    \\_\\_____/   \\_____/_/    \\_\\_| \\_/_/    \\_\\_____/ \\____/ ");

		} else { 
			System.out.println(" _    _           _____   _____  ______ _____  _____ _____ _____   ____  ");
			System.out.println("| |  | |   /\\    / ____| |  __ \\|  ____|  __ \\|  __ \\_   _|  __ \\ / __ \\ ");
			System.out.println("| |__| |  /  \\  | (___   | |__) | |__  | |__) | |  | || | | |  | | |  | |");
			System.out.println("|  __  | / /\\ \\  \\___ \\  |  ___/|  __| |  _  /| |  | || | | |  | | |  | |");
			System.out.println("| |  | |/ ____ \\ ____) | | |    | |____| | \\ \\| |__| || |_| |__| | |__| |");
			System.out.println("|_|  |_/_/    \\_\\_____/  |_|    |______|_|  \\_\\_____/_____|_____/ \\____/ ");

		}

	}//main

}//class


import java.util.Scanner;

public class array {
    
    public static void main (String[] args) {
        
        int controllodeldo = 0;

        do { //se ricevo input sbagliati riparto

        controllodeldo = 0; //autoesplicativo

        Scanner scanner = new Scanner(System.in);

        System.out.println("seleziona il numero di elementi da inserire nell'array: ");
        String numerodielementidelciclo = scanner.nextLine(); 
        System.out.println("inserisci 1 per avere un array di numeri, inserisci 2 per avere un array di parole");
        String numeriostringhe = scanner.nextLine();
        String controllonumerouno = "1"; //dopo controllo se mi ha chiesto il comando 1
        String controllonumerodue = "2"; //dopo controllo se mi ha chiesto il comando 2
        int numerodielementidellarray =  Integer.valueOf(numerodielementidelciclo); 
        int numerodicontrollodelciclo = 0;
        int numerodicontrollodelciclodue = 0;
        String[] stringaininput = new String[numerodielementidellarray]; //usata doper leggere l'input
        int[] intininput = new int[numerodielementidellarray]; //usata doper leggere l'input
        String numeroscannerizzato = "1"; 

        while(numerodicontrollodelciclo<numerodielementidellarray) { // ciclo che gira tante volte quante il numero di elementi dell'array richiesto
            if(numeriostringhe.equals(controllonumerouno)){ // controllo che mi abbia chiesto array di int
                System.out.printf("inserisci il %2d elemento \n", numerodicontrollodelciclo); 
                numeroscannerizzato = scanner.nextLine(); 
                intininput[numerodicontrollodelciclo] = Integer.valueOf(numeroscannerizzato); //assegno il valore isnerito all'array
                numerodicontrollodelciclo++;
            }
            else if (numeriostringhe.equals(controllonumerodue)){ //controllo che sia array di string
                System.out.printf("inserisci il %2d elemento \n", numerodicontrollodelciclo);
                stringaininput[numerodicontrollodelciclo] = scanner.nextLine(); //assegno il valore dato
                numerodicontrollodelciclo++;
            }
            else {
                controllodeldo=1; //se mi hanno dato un comando diverso ricomincio il programma
                System.out.println("Qualcosa è andato storto ed è colpa tua");
                break;
            }

        }

        


        while(numerodicontrollodelciclodue<numerodielementidellarray) {
          
            if(numeriostringhe.equals(controllonumerouno)){
                System.out.printf("%2d",intininput[numerodicontrollodelciclodue]);
                numerodicontrollodelciclodue++;
            }
            else if (numeriostringhe.equals(controllonumerodue)){
                System.out.println(stringaininput[numerodicontrollodelciclodue]);
                numerodicontrollodelciclodue++;
            }
            else {
                controllodeldo=1;
                break;
            }

        }
        
       
    } while (controllodeldo!=0);
    }
}

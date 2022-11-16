import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class eserciziofinale {
    
    public static void main (String[] args) {

        ArrayList<String> listaprimaria = new ArrayList<String>();
        ArrayList<String> listasecondaria = new ArrayList<String>();

        int controllowhile1=0;
        int controllowhile2=0;
        Scanner scanner = new Scanner(System.in);

        String username = "";
        String password = "";

        while(controllowhile1==0){

            listasecondaria=listaprimaria;

            System.out.println("Inserire username: ");
            username = scanner.nextLine();

            System.out.println("Inserire password: ");
            password = scanner.nextLine();

            System.out.printf("Confermi username = %s e password = %s ? (SI/NO) \n", username, password);
            String SINO = scanner.nextLine();

            int lunghezzausername = username.length();

            if(lunghezzausername<1){
                continue;
            }

            if(SINO.equalsIgnoreCase("no")){
                continue;
            }

            while(controllowhile2==0){

                System.out.print("Inserisci 1 per vedere il contenuto dell'array, isnerisci 2 per modificare l'array ");
                String unodue = scanner.nextLine();

                
                if(unodue.equals("1")){
                    System.out.println(listaprimaria);
                    continue;
                }
                else if(unodue.equals("2")){
                    int lunghezzarray = listaprimaria.size();
                    System.out.printf("Il tuo Array ha %2d elementi, da 0 a %2d quale elemento vuoi modificare con %2d un nuovo elemento aggiunto ", lunghezzarray, lunghezzarray, lunghezzarray);
                    Scanner scanner3 = new Scanner(System.in);
                    int posizione = scanner3.nextInt();
                    if (posizione<=lunghezzarray){
                        if (posizione==lunghezzarray){
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.println("inserisci il valore da aggiungere");
                            String valorechevaaggiunto = scanner1.nextLine();
                            listasecondaria.add(valorechevaaggiunto);
                        }
                        else{
                            System.out.print("Questo valore è ");
                            System.out.print(listaprimaria.get(posizione));
                            System.out.print(" quale valore vuoi inserire? ");
                            String nuovovalore1 = scanner.nextLine();
                            listasecondaria.set(posizione,nuovovalore1);
                        }
                    }
                }

                
                for(int i=0;i<3;i++){
                    if(i==2){
                        System.out.println("ultimo tentativo");
                    }
                    System.out.printf("Il nuovo array sarà così %s, inserire la password per confermare ", listasecondaria);
                    Scanner scanner2 = new Scanner(System.in);
                    String confermapassword = scanner2.nextLine();
                    if(confermapassword.equals(password)){
                        listaprimaria=listasecondaria;
                        System.out.println("le modifiche sono state effettuate");
                        break;
                    }
                }
                System.out.println("modifica fallita");
            }

        }


        



       
        






    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class testcomplessivojava {
    
    public static void main (String[] args) {

        String usernameadmin="admin";
        String passwordadmin="admin2";

        String username ="";
        String password="";

        ArrayList<String> listacibo = new ArrayList<String>();
        ArrayList<Integer> prezzicibo = new ArrayList<Integer>();
        ArrayList<Integer> scelta = new ArrayList<Integer>();

        listacibo.add("Pizza");
        prezzicibo.add(5);
        listacibo.add("Lasagna");
        prezzicibo.add(7);
        listacibo.add("Spaghetti alle vongole");
        prezzicibo.add(10);
        listacibo.add("Acqua frizzante");
        prezzicibo.add(1);

        int budget=0;

        int controllowhile1=0;
        int controllowhile2=0;
        int controllowhile3=0;
        int controllowhile4=0;
        int controllo=0;
        int controllocredenzialiadmin=0;
        Scanner scanner = new Scanner(System.in);
        Scanner intscanner = new Scanner(System.in);



        System.out.println("se sei un admin inserisci 1");
        int admin=intscanner.nextInt();
        if(admin==1){
            for(int i=0;i<3;i++){
                if(i==2){
                    System.out.println("ultimo tentativo");
                }
                System.out.println("Per effettuare il login inserisci username: ");
                String confermausername = scanner.nextLine();
                System.out.println("Per effettuare il login inserisci password: ");
                String confermapassword = scanner.nextLine();
                if(confermapassword.equals(passwordadmin) && confermausername.equals(usernameadmin)){
                    System.out.println("Credenziali corrette");
                    controllocredenzialiadmin=1;
                    controllowhile1=1;
                    break;
                }
                else if(i<=2){
                    System.out.println("Riprova");
                }
                else if (i==3){
                    System.out.println("Troppi tentativi errati");
                    break;
                }
            }

            System.out.println("se vuoi modificare il menù inserisci 1");
            int modifichealmenu=intscanner.nextInt();

            if(modifichealmenu==1){
                System.out.println("Questo è il menu al momento: ");

                for (int i=0; i<listacibo.size();i++){
                    System.out.print(i+1);
                    System.out.print("  ");
                    System.out.print(listacibo.get(i));
                    System.out.print("  ");
                    System.out.print(prezzicibo.get(i));
                    System.out.print("\n");
                }

                int modificaelimina=0;

                while(modificaelimina!=3){

                    System.out.println("Inserisci 1 per modificare un articolo, scegli 2 eliminare un articolo, scegli 3 per termianre");
                     modificaelimina=intscanner.nextInt();

                    if(modificaelimina==1){

                        System.out.println("Scegli il numero dell'articolo da modificare");
                        int articolodamodificare=intscanner.nextInt();

                        if(articolodamodificare<=listacibo.size()){

                            System.out.println("Inserisci il nome dell'articolo");
                            String nuovonome=scanner.nextLine();
                            listacibo.set(articolodamodificare-1,nuovonome);

                            System.out.println("Inserisci il prezzo dell'articolo");
                            int nuovoprezzo=intscanner.nextInt();
                            prezzicibo.set(articolodamodificare-1,nuovoprezzo);
                        }
                    }
                    if(modificaelimina==2){
                        System.out.println("Scegli il numero dell'articolo da eliminare");
                        int articolodamodificare=intscanner.nextInt();

                        if(articolodamodificare<=listacibo.size()){

                            listacibo.remove(articolodamodificare);
                            prezzicibo.remove(articolodamodificare);

                        }
                    }
                    if(modificaelimina==3){
                        break;
                    }

                    System.out.println("il nuovo menu: ");

                    for (int i=0; i<listacibo.size();i++){
                        System.out.print(i+1);
                        System.out.print("  ");
                        System.out.print(listacibo.get(i));
                        System.out.print("  ");
                        System.out.print(prezzicibo.get(i));
                        System.out.print("\n");
                    }
                }
            }
        }







        while(controllowhile1==0){

            System.out.println("Se vuoi uscire dal programma scrivi 1, atrimenti per ordinare scrivi 2");
            String uscita = scanner.nextLine();
            if(uscita.equals("1")){
                break;
            }

            System.out.println("Inserire username: ");
            username = scanner.nextLine();

            System.out.println("Inserire password: ");
            password = scanner.nextLine();

            System.out.printf("Confermi username = %s e password = %s ? (SI/NO) \n", username, password);
            String SINO = scanner.nextLine();

            int lunghezzausername = username.length();

            if(lunghezzausername<1){
                System.out.println("input non valido");
                continue;
            }

            if(SINO.equalsIgnoreCase("no")){
                continue;
            }

            break;
        }

        if(controllocredenzialiadmin!=1){
            for(int i=0;i<3;i++){
                if(i==2){
                    System.out.println("ultimo tentativo");
                }
                System.out.println("Per effettuare il login inserisci username: ");
                String confermausername = scanner.nextLine();
                System.out.println("Per effettuare il login inserisci password: ");
                String confermapassword = scanner.nextLine();
                if(confermapassword.equals(password) && confermausername.equals(username)){
                    System.out.println("Credenziali corrette");
                    break;
                }
                else if(i<=2){
                    System.out.println("Riprova");
                }
                else if (i==3){
                    System.out.println("Troppi tentativi errati");
                }

            }
        }



        if(controllocredenzialiadmin==1){
            budget=10000;
            System.out.printf("L'Admin non ha problemi di budget, budget=%2d \n", budget);
        }



        
        else {
            while(controllowhile2==0){

                System.out.println("Inserisci il tuo budget");
                budget = intscanner.nextInt();

                System.out.printf("Confermi il budget di = %2d ? (SI/NO) \n", budget);
                String SINO = scanner.nextLine();

                if(budget==0){
                    System.out.println("Non si può comprare nulla senza budget");
                    continue;
                }

                if(!SINO.equalsIgnoreCase("si")){
                    continue;
                }

                break;
            }
        }






        while(controllowhile3==0){

            System.out.println("Scrivi 1 per visualizzare il menù e scegliere il piatto, scrivi 2 per visualizzare il carrello e procedere al pagamento, scrivi 3 per uscire");
            int inputmenu = intscanner.nextInt();
            
            if (inputmenu==1){
                for (int i=0; i<listacibo.size();i++){
                    System.out.print(i+1);
                    System.out.print("  ");
                    System.out.print(listacibo.get(i));
                    System.out.print("  ");
                    System.out.print(prezzicibo.get(i));
                    System.out.print("\n");
                }
                int inputpiatto=1;
                while(inputpiatto!=0){
                    System.out.println("Inserisci il numero del piatto da acquistare, inserisci 0 per continuare");
                    inputpiatto = intscanner.nextInt();
                    if(inputpiatto!=0 && inputpiatto<=listacibo.size()){
                        scelta.add(inputpiatto);
                        System.out.println("Oggetto aggiunto al carrello");
                    }
                }
                if(inputpiatto==0){
                    inputmenu=2;
                }    
            }

            else if(inputmenu==2){
                System.out.println("Il tuo carrello comprende: ");
                for (int i=0; i<scelta.size();i++){
                    System.out.print(i+1);
                    System.out.print("  ");
                    System.out.print(listacibo.get(scelta.get(i)-1));
                    System.out.print("  ");
                    System.out.print(prezzicibo.get(scelta.get(i)-1));
                    System.out.print("\n");
                }

            


                int spesatotale=0;
                for (int i=0; i<scelta.size();i++){
                    spesatotale+=prezzicibo.get(scelta.get(i)-1);
                }
                System.out.printf("La tua spesa totale è di %2d \n", spesatotale);


                System.out.printf("Se vuoi procedere all'acquisto inserisci 1, altrimenti se vuoi eliminare qualcosa dal carrello inserisci 2, se vuoi tornare al menù iniziale premi 3 \n");
                int inputacquisto=intscanner.nextInt();
            
                while(controllowhile4==0){
                    if(inputacquisto==1){
                        if(spesatotale<=budget){
                            for(int i=0;i<3;i++){
                                if(i==2){
                                    System.out.println("ultimo tentativo");
                                }
                                System.out.println("Per effettuare l'acquisto inserisci username: ");
                                String confermausername = scanner.nextLine();
                                System.out.println("Per effettuare l'acquisto inserisci password: ");
                                String confermapassword = scanner.nextLine();
                                if(confermapassword.equals(password) && confermausername.equals(username)){
                                    System.out.println("Credenziali corrette");
                                    controllo=1;
                                    break;
                                }
                                else if(confermapassword.equals(passwordadmin) && confermausername.equals(usernameadmin)){
                                    System.out.println("Credenziali corrette");
                                    controllo=1;
                                    break;
                                }
                                else if(i<=2){
                                    System.out.println("Riprova");
                                }
                                else if (i==3){
                                    System.out.println("Troppi tentativi errati");
                                    controllo=2;
                                    break;
                                }
                                
                            }
                            if(controllo==1){
                                budget-=spesatotale;
                                System.out.printf("il tuo budget residuo è di %2d \n", budget);
                                break;
                            }
                            if(controllo==2){
                                break;
                            }
                        }
                    }
                    else if(inputacquisto==2){
                        System.out.println("Il tuo carrello comprende: ");
                        for (int i=0; i<scelta.size();i++){
                            System.out.print(i+1);
                            System.out.print("  ");
                            System.out.print(listacibo.get(scelta.get(i)-1));
                            System.out.print("  ");
                            System.out.print(prezzicibo.get(scelta.get(i)-1));
                            System.out.print("\n");
                        }
                        System.out.println("Scegli cosa vuoi eliminare: ");
                        int eliminare=intscanner.nextInt();
                        if(eliminare<=scelta.size()){
                            scelta.remove(eliminare-1);
                            break;
                        }
                    }
                    else if(inputacquisto==3){
                        break;
                    }
                    else {
                        System.out.println("Comando non riconosciuto");
                        continue;
                    }
                }
            }
            else if (inputmenu==3){
                break;
            }
            else {
                System.out.println("Comando non riconosciuto");
                continue;
            }
        }



        

















    }
}
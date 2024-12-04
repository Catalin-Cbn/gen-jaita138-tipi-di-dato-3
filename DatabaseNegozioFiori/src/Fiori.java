import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fiori {
    public static void main(String[] args) throws Exception {
        ;

        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while (cont) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Come'è il tuo fiore preferito?");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Tipologia: ");
            System.out.println("0 - Annuale");
            System.out.println("1 - Perenne");
            System.out.println("2 - Bulboso");
            System.out.println("3 - Arbustivo");
            System.out.println("4 - Treppiante");
            System.out.println("5 - Acquatico");
            byte tipologiaNum = sc.nextByte();
            TipologiaFiore tipologiaFiore = TipologiaFiore.values()[tipologiaNum];

            System.out.println("Prezzo: ");
            double prezzo = sc.nextDouble();

            System.out.println("Quantità: ");
            short quantita = sc.nextShort();

            System.out.println("Colore principale: ");
            String colorePrincipale = sc.nextLine();

            System.out.println("Inizio disponibilità: ");

            String inizioDisponibilitaStr = sc.nextLine();
            LocalDate inizioDisponibilita = LocalDate.parse(inizioDisponibilitaStr, formatter);

            System.out.println("Fine disponibilità: ");
            String fineDisponibilitaStr = sc.nextLine();
            LocalDate fineDisponibilita = LocalDate.parse(fineDisponibilitaStr, formatter);

            System.out.println("Profumo (true/false): ");
            boolean profumo = sc.nextBoolean();

            System.out.println("Artificiale: ");
            Boolean artificiale = sc.nextBoolean();

            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("");

            System.out.println("Ecco il tuo fiore: ");
            System.out.println("Nome: " + nome);
            System.out.println("Tipologia: " + tipologiaFiore);
            System.out.println("Prezzo: " + prezzo);
            System.out.println("Quantità : " + quantita);
            System.out.println("Colore Principale: " + colorePrincipale);
            System.out.println("Inizio disponibilità: " + inizioDisponibilita);
            System.out.println("Fine disponibilità: " + fineDisponibilita);
            System.out.println("Profumo: " + profumo);
            System.out.println("Artificiale: " + artificiale);

            System.out.println("Vuoi inserire un altro tipo di fiore? (true/false): ");
            cont = sc.nextBoolean();
            sc.nextLine();

        }
        sc.close();
        System.out.println("Grazie per avere utilizzato il nostro servizio!");
    }
}

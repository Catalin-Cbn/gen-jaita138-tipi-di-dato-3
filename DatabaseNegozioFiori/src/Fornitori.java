import java.util.Scanner;

public class Fornitori {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean cont = true;

        while (cont) {
            System.out.println("Informazioni sui fornitori");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Categoria:");
            System.out.println("0 - Piante");
            System.out.println("1 - Vasellame");
            System.out.println("2 - Concime");
            System.out.println("3 - Giardinaggio");
            byte categoriaNum = sc.nextByte();
            CategoriaFornitore categoriaFornitore = CategoriaFornitore.values()[categoriaNum];

            System.out.println("Partita Iva: ");
            String partitaIva = sc.nextLine();

            System.out.println("Luogo: ");
            String luogo = sc.nextLine();

            System.out.println("Telefono: ");
            String nTelefono = sc.nextLine();

            System.out.println("E-mail: ");
            String email = sc.nextLine();

            System.out.println("IBAN: ");
            String iban = sc.nextLine();

            System.out.println("Nome Referente: ");
            String nomeReferente = sc.nextLine();

            System.out.println("Note: ");
            String note = sc.nextLine();

            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("");

            System.out.println("Info fornitore inserite:");

            System.out.println("Nome: " + nome);
            System.out.println("Categoria: " + categoriaFornitore);
            System.out.println("Partita IVA: " + partitaIva);
            System.out.println("Luogo: " + luogo);
            System.out.println("Telefono: " + nTelefono);
            System.out.println("E-Mail: " + email);
            System.out.println("IBAN: " + iban);
            System.out.println("Nome Referente: " + nomeReferente);
            System.out.println("Note: " + note);

            System.out.println("Vuoi ricompilare le info?");
            cont = sc.nextBoolean();
            sc.nextLine();

        }
        sc.close();
        System.out.println("Grazie per avere utilizzato il servizio!");

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        System.out.println("CIAO");*/
        //

       /* boolean x = false;
        x = true;

        byte numeroPiccolo = 100;
        short numeroNonProprioPiccolo = 1000;
        int numeroIntero = 4;
        long numeroInteroGrande = 1000000000;
        double numeroDecimale = 0.5;
        // float altroNumeroDecimale = 0.5f;
        // Sia float che double rappresentano i numeri decimali. Come regola generale possiamo usare
        // praticamente sempre i double per questioni di velocità dei calcoli.


        numeroIntero = numeroPiccolo; // ES. CASTING IMPLICITO
        System.out.println("Numero intero: " + numeroIntero);

        numeroIntero = numeroIntero + 2000;

        numeroPiccolo = (byte) numeroIntero; // ES. CASTING ESPLICITO...può portare a possibile perdita di dati!! ATTENZIONE
        System.out.println("Numero piccolo: " + numeroPiccolo);

        char singoloCarattere = 'a';
        String stringa = "HelloWorld";

        System.out.println(stringa + "!" + numeroIntero);
        System.out.println("La lunghezza della stringa è: " + stringa.length());
        System.out.println("Il primo carattere della stringa é:" + stringa.charAt(0));
        System.out.println(stringa.replaceAll("World", "Qualcosaltro"));
*/
        // ****************************************** ARRAYS ************************************************************

       /* String[] arrayDiStringhe = {"ciao", "a", "tutti"};

        System.out.println("La lunghezza dell'array é: " + arrayDiStringhe.length);
*//*        System.out.println("Il primo elemento è: " + arrayDiStringhe[0]);
        System.out.println("Il secondo elemento è: " + arrayDiStringhe[1]);
        System.out.println("Il terzo elemento è: " + arrayDiStringhe[2]);*//*
        // System.out.println("Il terzo elemento è: " + arrayDiStringhe[3]);
        for (int i = 0; i < arrayDiStringhe.length; i++) {
            System.out.println("Elemento corrente: " + arrayDiStringhe[i]);
            System.out.println("Indice corrente: " + i);
        }
*/
        // ************************************ METODI ************************************

      /*  int risultato = sum(2, 3);
        System.out.println("Il risultato è: " + risultato);

        printSum(2, 3);*/

        // ********************************** SCANNER *************************************
        Scanner scanner = new Scanner(System.in); // Inizializzazione Scanner, oggetto utile per richiedere dati in input da parte dell'utente

        System.out.println("Per favore, inserisci il tuo nome seguito dal tasto invio");
        String name = scanner.nextLine();

        System.out.println("Hai inserito: " + name);
        System.out.println("Dammi ora un numero intero");
        int primoNumero = Integer.parseInt(scanner.nextLine()); // alternativa a scanner.nextInt che più avanti ci risolverà un po' di problemi. Consiglio di usare sempre nextLine
        System.out.println("Dammi ora un secondo numero intero");
        int secondoNumero = Integer.parseInt(scanner.nextLine());

        System.out.println("La somma dei numeri inseriti è: " + sum(primoNumero, secondoNumero));


        scanner.close(); // Non dimentichiamoci come BEST PRATCTICE di chiudere lo Scanner
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void printSum(int num1, int num2) { // void <-- Il metodo non ritorna niente
        System.out.println("La somma è: " + (num1 + num2));
    }
}
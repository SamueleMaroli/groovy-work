import java.util.Scanner

/**
 * Classe per pensare a un numero e fare indovinare all'utente.
 */
@CompileStatic
class ThinkOfANumber {

    static void main(String[] args) {
        // Genera un numero casuale tra 0 e 5
        int x = new SecureRandom().nextInt(6)  // Usa Random invece di Math.random() per un intero
        println 'The computer has chosen a number between 0 and 5. Can you guess it?'

        // Ottiene l'input dell'utente
        Scanner scanner = new Scanner(System.in)
        int guess = scanner.nextInt()

        // Controlla se l'indovinello è corretto
        if (guess == x) {
            println 'Well done'
        } else {
            println "Tough luck - you're wrong"
        }
    }

}

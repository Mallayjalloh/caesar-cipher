public class Main {

    public static void main(String[] args) {

        String message = "how are you doing today";
        int offset = 12;

        // Creating an instance of the CaesarCipher class
        CaesarCipher caesarCipher = new CaesarCipher();

        // Display
        System.out.println("\nMessage: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Ciphered message: " + caesarCipher.cipher(message, offset));
    }
}

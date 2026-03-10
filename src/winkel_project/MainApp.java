package winkel_project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Maak de winkel (vaste lijst met producten) en een lege winkelwagen.
        Store store = new Store();
        ShoppingCart cart = new ShoppingCart();

        // Scanner om input van de gebruiker in te lezen.
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Assignment Winkel ===");

        // Toon de beschikbare items + uitleg over de keuzes.
        store.displayItems();

        // Blijf doorvragen totdat de gebruiker -1 kiest.
        while (true) {
            System.out.print("Typ keuze: ");

            // Alleen hele getallen accepteren.
            if (!scanner.hasNextInt()) {
                System.out.println("Typ een geldig getal.");
                scanner.next(); // foute input weggooien
                continue;
            }

            int input = scanner.nextInt();

            // -1 = stoppen
            if (input == -1) {
                System.out.println("Bedankt voor het winkelen! Tot ziens.");
                break;
            }
            // 0 = winkelwagen/bon tonen
            else if (input == 0) {
                cart.displayCart();
            }
            // Anders: probeer een item met dit id toe te voegen
            else {
                Item item = store.findById(input);
                if (item == null) {
                    System.out.println("Verkeerd ID, probeer opnieuw.");
                } else {
                    cart.addItem(item);
                }
            }
        }

        // Netjes afsluiten.
        scanner.close();
    }
}
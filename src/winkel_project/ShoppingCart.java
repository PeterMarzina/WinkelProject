package winkel_project;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // Lijst met items die de gebruiker heeft toegevoegd aan de winkelwagen.
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Veiligheidscheck: niets doen als er geen item is.
        if (item == null) {
            return;
        }

        // Voeg het item toe en geef feedback aan de gebruiker.
        items.add(item);
        System.out.println(item.getName() + " toegevoegd aan winkelwagen.");
    }

    public void displayCart() {
        // Print een eenvoudige bon (receipt) met alle producten en het totaal.
        System.out.println("\n=== Bon ===");

        // Als de winkelwagen leeg is, print alleen een totaal van 0.
        if (items.isEmpty()) {
            System.out.println("(cart is empty)");
            System.out.println("Totaal: €0.00");
            System.out.println("============\n");
            return;
        }

        // Loop over alle items, print ze en tel de prijs op.
        double total = 0.0;
        int line = 1;
        for (Item item : items) {
            System.out.printf("%d. %s - $%.2f%n", line++, item.getName(), item.getPrice());
            total += item.getPrice();
        }

        // Print het totaal onderaan.
        System.out.println("------------");
        System.out.printf("Totaal: $%.2f%n", total);
        System.out.println("============\n");
    }
}
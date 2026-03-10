package winkel_project;

// Basisklasse voor alle producten: elk item heeft een id, naam en prijs.
public abstract class Item {
    // Uniek nummer zodat de gebruiker het item kan kiezen.
    private final int id;
    private final String name;
    private final double price;

    protected Item(int id, String name, double price) {
        // Zet de vaste waarden van dit product.
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter voor het id.
    public final int getId() {
        return id;
    }

    // Getter voor de naam.
    public final String getName() {
        return name;
    }

    // Getter voor de prijs.
    public final double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        // Netjes print-formaat voor in de store-lijst.
        return String.format("%d) %s - $%.2f", id, name, price);
    }
}
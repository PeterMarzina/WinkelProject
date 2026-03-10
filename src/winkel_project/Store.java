package winkel_project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class Store {
	    // Interne lijst met producten in de winkel (wordt gevuld in de constructor).
	    private final List<Item> items = new ArrayList<>();

	    public Store() {
	        // Voeg een vaste set producten toe (id, naam, prijs).
	        items.add(new StoreItem(1, "Soap", 2.35));
	        items.add(new StoreItem(2, "Bread", 1.96));
	        items.add(new StoreItem(3, "Cheese", 3.25));
	        items.add(new StoreItem(4, "Ice cream", 4.25));
	        items.add(new StoreItem(5, "Juice", 2.45));
	        items.add(new StoreItem(6, "Milk", 1.55));
	    }

	    public List<Item> getItems() {
	        // Geef een read-only view terug zodat andere code de lijst niet kan aanpassen.
	        return Collections.unmodifiableList(items);
	    }

	    public Item findById(int id) {
	        // Zoek een item op basis van het id.
	        for (Item item : items) {
	            if (item.getId() == id) {
	                return item;
	            }
	        }
	        // Niet gevonden.
	        return null;
	    }

	    public void displayItems() {
	        // Print alle items met id/naam/prijs en leg de invoer-keuzes uit.
	        System.out.println("=== Beschikbare producten ===");
	        for (Item item : items) {
	            System.out.println(item);
	        }
	        System.out.println("Voer het ID in om het aan de winkelwagen toe te voegen, 0 om de winkelwagen te tonen, -1 om af te sluiten.");
	    }
	}
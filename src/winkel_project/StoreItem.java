package winkel_project;

// Product dat in de store-lijst gebruikt wordt.
public class StoreItem extends Item {
    public StoreItem(int id, String name, double price) {
        // Roept de constructor van de basisklasse Item aan.
        super(id, name, price);
    }
}
# WinkelProject

## Wat is dit?
Dit is een simpel Java-project van een winkel in de console.
De gebruiker ziet een lijst met producten en kan producten toevoegen aan een winkelwagen.
Daarna kan de gebruiker de bon bekijken of stoppen met het programma.

## Wat kan het programma?
- producten laten zien
- een product kiezen met een ID
- producten in de winkelwagen zetten
- de winkelwagen en het totaal tonen
- foutieve invoer opvangen
- stoppen met `-1`

## Hoe werkt het?
Als het programma start, zie je een lijst met producten.
Daarna kun je een getal invoeren.

### Keuzes
- `1 t/m 6` = product toevoegen
- `0` = winkelwagen / bon tonen
- `-1` = stoppen

Als je geen geldig getal invoert, vraagt het programma opnieuw om invoer.

## Bestanden
De broncode staat in `src/winkel_project/`.

### `MainApp.java`
Start het programma en leest de invoer van de gebruiker.

### `Store.java`
Bevat de producten van de winkel en zoekt een product op ID.

### `ShoppingCart.java`
Beheert de winkelwagen en laat de bon zien.

### `Item.java`
De basisklasse van een product met een ID, naam en prijs.

### `StoreItem.java`
Een gewoon winkelproduct dat van `Item` erft.

## Producten in dit project
- Soap
- Bread
- Cheese
- Ice cream
- Juice
- Milk

## Starten
Je kunt het project compileren en starten met:

```bat
javac -d bin src\winkel_project\*.java
java -cp bin winkel_project.MainApp
```

## Extra opmerking
De prijzen worden nu met een dollarteken (`$`) getoond.
Op sommige plekken staat ook een euroteken (`€`).
Dat werkt gewoon, maar kan later nog netter gelijk worden gemaakt.
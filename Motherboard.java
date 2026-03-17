public class Motherboard extends Produkt {
    // Erstellung der Variable
    private String bauform;
    /**
     * Das ist der Konstruktor der Klasse Motherboard
     *
     * @param marke
     * @param modell
     * @param preis
     * @param bauform
     */
    public Motherboard(String marke, String modell, double preis, String bauform) {
        super(marke, modell, preis);
        this.bauform = bauform;
    }
    // Das ist der Setter
    public void setBauform(String bauform) {this.bauform = bauform;}
    // Das ist der Getter
    public String getBauform() {return bauform;}
    // Gibt die Bauform des Mainboards zurück und durch super wird diese Ausgabe an die Ausgabe der Elternklasse angehangen
    @Override
    public String toString() {
        return super.toString() + ", Bauform: " + bauform;
    }
}
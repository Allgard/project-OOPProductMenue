public class Maus extends Produkt {
    // Erstellung der Variable
    private double dpi;
    /**
     * Das ist der Konstruktor der Klasse Maus
     *
     * @param marke
     * @param modell
     * @param preis
     * @param dpi
     */
    public Maus(String marke, String modell, double preis, double dpi) {
        super(marke, modell, preis);
        this.dpi = dpi;
    }
    // Das ist der Setter
    public void setDpi(double dpi) {this.dpi = dpi;}
    // Das ist der Getter
    public double getDpi() {return dpi;}
    // Gibt den DPI Wert der Maus zurück und durch super wird diese Ausgabe an die Ausgabe der Elternklasse angehangen
    @Override
    public String toString() {
        return super.toString() + ", DPI: " + dpi;
    }
}
public class Monitor extends Produkt {
    // Erstellung der Variable
    private double zoll;
    /**
     * Das ist der Konstruktor der Klasse Monitor
     *
     * @param marke
     * @param modell
     * @param preis
     * @param zoll
     */
    public Monitor(String marke, String modell, double preis, double zoll) {
        super(marke, modell, preis);
        this.zoll = zoll;
    }
    // Das ist der Setter
    public void setZoll(double zoll) {this.zoll = zoll;}
    // Das ist der Getter
    public double getZoll() {return zoll;}
    // Gibt die Zollmaße des Monitors zurück und durch super wird diese Ausgabe an die Ausgabe der Elternklasse angehangen
    @Override
    public String toString() {
        return super.toString() + ", Zoll: " + zoll;
    }
}
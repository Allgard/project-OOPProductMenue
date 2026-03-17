public class Produkt {
    // Erstellung der Variablen
    private String marke, modell;
    private double preis;
    /**
     * Das ist der Konstruktor für die Elternklasse
     *
     * @param marke
     * @param modell
     * @param preis
     */
    public Produkt(String marke, String modell, double preis) {
        this.marke = marke;
        this.modell = modell;
        this.preis = preis;
    }
    // Das sind die Setter
    public void setMarke(String marke) {this.marke = marke;}
    public void setModell(String modell) {this.modell = modell;}
    public void setPreis(double preis) {this.preis = preis;}
    // Das sind die Getter
    public String getMarke() {return marke;}
    public String getModell() {return modell;}
    public double getPreis() {return preis;}
    // Gibt die Grunddaten des Produkts zurück
    @Override
    public String toString() {
        return "Marke: " + marke +
                ", Modell: " + modell +
                ", Preis: " + preis + "€";
    }
}
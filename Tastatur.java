public class Tastatur extends Produkt {
    // Erstellung der Variablen
    private boolean de, en;
    /**
     * Das ist der Konstruktor der Klasse Tastatur
     *
     * @param marke
     * @param modell
     * @param preis
     * @param de
     * @param en
     */
    public Tastatur(String marke, String modell, double preis, boolean de, boolean en) {
        super(marke, modell, preis);
        this.de = de;
        this.en = en;
    }
    // Das sind die Setter
    public void setDe(boolean de) {this.de = de;}
    public void setEn(boolean en) {this.en = en;}
    // Das sind die Getter
    public boolean isDe() {return de;}
    public boolean isEn() {return en;}
    // Gibt die Variante der Tastatur zurück und durch super wird diese Ausgabe an die Ausgabe der Elternklasse angehangen
    @Override
    public String toString() {
        return super.toString() +
                ", DE: " + de +
                ", EN: " + en;
    }
}
import java.util.ArrayList;
import java.util.Scanner;
// Das ist die Klasse für das Gesamtkonstrukt für das Projekt: PC-Shop
public class MainShop {
    // ArrayList<> für die Produkte
    static ArrayList<Produkt> produkte = new ArrayList<>();
    // Scanner für Benutzereingaben
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {hauptMenue();}
    // Hilfsmethode: Wenn der Benutzer etwas anderes als eine Ganzzahl eingibt (z.B. Buchstaben), wird nicht das Programm abstürzen.
    // Stattdessen kommt: "Fehlerhafte Eingabe" und der Benutzer darf es erneut versuchen.
    static int leseInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Fehlerhafte Eingabe");
            sc.next();
        }
        int zahl = sc.nextInt();
        sc.nextLine();
        return zahl;
    }
    // Hilfsmethode: Wenn der Benutzer etwas anderes als eine Zahl/Kommazahl eingibt (z.B. Buchstaben), wird nicht das Programm abstürzen.
    // Stattdessen kommt: "Fehlerhafte Eingabe" und der Benutzer darf es erneut versuchen.
    static double leseDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Fehlerhafte Eingabe");
            sc.next();
        }
        double zahl = sc.nextDouble();
        sc.nextLine();
        return zahl;
    }
    // Das ist das Hauptmenü mit einem if-else Konstrukt für die Menüpunkte
    static void hauptMenue() {
        int auswahl;
        // Ausgabe Menüpunkte
        System.out.println("\n-------------------------------------------------------------------------------------\nPC-Shop\t\t\t\t\tHauptmenü\t\t\t\tvon:\tKevin Bonowski\n-------------------------------------------------------------------------------------\n1) Produkt anlegen\n2) Produkt bearbeiten\n3) Produkt suchen\n4) Produkt löschen\n0) Shop beenden\n-------------------------------------------------------------------------------------");
        // Ausgabe für die Auswahl
        System.out.print("Bitte wählen: ");
        auswahl = sc.nextInt();
        // Menue läuft so lange, bis der Benutzer 0 eingibt
        if (auswahl == 1) {produktAnlegen(); hauptMenue();}
        else if (auswahl == 2) {bearbeiten(); hauptMenue();}
        else if (auswahl == 3) {suchen(); hauptMenue();}
        else if (auswahl == 4) {loeschen(); hauptMenue();}
        else if (auswahl == 0) {System.out.println("Shop beendet.");}
        else {System.out.println("Fehlerhafte Eingabe"); hauptMenue();}
    }
    // Das ist der Menüpunkt um ein Produkt anzulegen
    static void produktAnlegen() {
        System.out.println("1) Monitor 2) Motherboard 3) Tastatur 4) Maus");
        int kategorie = leseInt();
        // Abfrage des Markennamen
        System.out.print("Marke: ");
        String marke = sc.nextLine();
        // Abfrage des Modellnamen
        System.out.print("Modell: ");
        String modell = sc.nextLine();
        // Abfrage des Preises
        System.out.print("Preis: ");
        double preis = leseDouble();

        if (marke.isEmpty() || modell.isEmpty()) {
            System.out.println("Produkt konnte aufgrund leerer Eingabewerte nicht gespeichert werden");
            return;
        }

        Produkt p;

        if (kategorie == 1) {
            // Abfrage der Zollgröße für den Monitor (z.B. 34)
            System.out.print("Zoll: ");
            double zoll = leseDouble();
            p = new Monitor(marke, modell, preis, zoll);
        } else if (kategorie == 2) {
            // Abfrage der Bauform vom Mainbord (z.B. ATX)
            System.out.print("Bauform: ");
            String bauform = sc.nextLine();
            // Wenn die Eingabe leer gelassen wird kann das Produkt nicht abgespeichert werden
            if (bauform.isEmpty()) {
                System.out.println("Produkt konnte aufgrund leerer Eingabewerte nicht gespeichert werden");
                return;
            }

            p = new Motherboard(marke, modell, preis, bauform);
        } else if (kategorie == 3) {
            // Abfrage via Boolean deutsches/englisches Tastaturlayout J/N
            System.out.print("Deutsch (1 = ja, 0 = nein): ");
            int de = leseInt();

            System.out.print("Englisch (1 = ja, 0 = nein): ");
            int en = leseInt();

            p = new Tastatur(marke, modell, preis, de == 1, en == 1);
        } else if (kategorie == 4) {
            // Abfrage des DPI Wertes von der Maus
            System.out.print("DPI: ");
            double dpi = leseDouble();
            p = new Maus(marke, modell, preis, dpi);
        } else {
            System.out.println("Fehlerhafte Eingabe");
            return;
        }

        produkte.add(p);
        System.out.println("Produkt gespeichert!");
    }
    // Das ist der Menüpunkt um ein Produkt zu bearbeiten
    static void bearbeiten() {
        if (produkte.size() == 0) {
            System.out.println("Keine Produkte vorhanden");
            return;
        }

        for (int i = 0; i < produkte.size(); i++) {
            System.out.println(i + ") " + produkte.get(i).getMarke() + " " + produkte.get(i).getModell());
        }

        System.out.print("Produkt wählen: ");
        int index = leseInt();

        if (index < 0 || index >= produkte.size()) {
            System.out.println("Fehlerhafte Eingabe");
            return;
        }

        Produkt alt = produkte.get(index);

        System.out.print("Neue Marke: ");
        String marke = sc.nextLine();

        System.out.print("Neues Modell: ");
        String modell = sc.nextLine();

        System.out.print("Neuer Preis: ");
        double preis = leseDouble();

        if (marke.isEmpty() || modell.isEmpty()) {
            System.out.println("Produkt konnte aufgrund leerer Eingabewerte nicht gespeichert werden");
            return;
        }

        alt.setMarke(marke);
        alt.setModell(modell);
        alt.setPreis(preis);

        System.out.println("Produkt aktualisiert!");
    }
    // Das ist der Menüpunkt um ein Produkt zu suchen
    static void suchen() {
        if (produkte.size() == 0) {
            System.out.println("Keine Produkte vorhanden");
            return;
        }
        System.out.print("Suchbegriff: ");
        String such = sc.nextLine().toLowerCase();

        boolean gefunden = false;

        for (int i = 0; i < produkte.size(); i++) {
            Produkt p = produkte.get(i);
            String alleEigenschaften = p.getMarke().toLowerCase() + " "
                    + p.getModell().toLowerCase() + " "
                    + p.getPreis() + " ";
            // Typ-spezifische Eigenschaften
            if (p instanceof Monitor) {
                alleEigenschaften += ((Monitor) p).getZoll() + " ";
            } else if (p instanceof Motherboard) {
                alleEigenschaften += ((Motherboard) p).getBauform().toLowerCase() + " ";
            } else if (p instanceof Tastatur) {
                alleEigenschaften += (((Tastatur) p).isDe() ? "de " : "")
                        + (((Tastatur) p).isEn() ? "en " : "");
            } else if (p instanceof Maus) {
                alleEigenschaften += ((Maus) p).getDpi() + " ";
            }
            // Suche prüfen
            if (alleEigenschaften.contains(such)) {
                System.out.println(i + ") " + p); // nutzt toString()
                gefunden = true;
            }
        }
        if (!gefunden) {
            System.out.println("Keine Treffer gefunden");
        }
    }
    // Das ist der Menüpunkt um ein Produkt zu löschen
    static void loeschen() {
        for (int i = 0; i < produkte.size(); i++) {
            System.out.println(i + ") " + produkte.get(i));
        }
    }
}
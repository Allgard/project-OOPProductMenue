# project-OOPProductMenue

Aufgabenblatt

OOP Projekt PC-Shop
Legen Sie sich zuerst ein neues Projekt mit dem Namen “OOPProjektPCShop[Vorname Name]“ an
und erstellen Sie einen neue Klasse MainShop mit der main-Methode.
Folgendes Hauptmenü soll nach dem Start des Programms anzeigt werden:

-------------------------------------------------------------------------------------
PC-Shop                         Hauptmenü               von: [Ihr Vor - und Nachname]
-------------------------------------------------------------------------------------
1) Produkt anlegen
2) Produkt bearbeiten
3) Produkt suchen
4) Produkt löschen
0) Shop beenden
-------------------------------------------------------------------------------------
Bitte wählen:

1.)
Lagern Sie die Logik für das Hauptmenü in die Methode hauptMenue(). Bei falscher Eingabe soll
eine Info „Fehlerhafte Eingabe“ angezeigt werden und das Hauptmenü erneut angezeigt werden.

2.)
Die Logik für das Anlegen eines neuen Produkts soll in der Methode produktAnlegen() abgearbeitet
werden. Beim Anlegen eines neuen Produkts sollen folgende Produktkategorien angeboten werden:
Monitor, Motherboard, Tastatur und Maus. Zu jedem Produkt MUSS Marke, Modell, Preis
angegeben werden und jeweils mindestens 1 Eigenschaft, die nur für den Typ zutrifft. Verhindern
Sie doppelte Eigenschaften in den Klassen durch Vererbung. Sollte eine Eigenschaft fehlen/leer
sein, darf das Produkt nicht abgespeichert werden und die Info „Produkt konnte aufgrund leerer
Eingabewerte nicht gespeichert werden“ soll angezeigt werden. Anschließend soll das Hauptmenü
wieder aufgerufen werden. Nach dem wir alle benötigten Daten eingeben haben, soll eine Abfrage
kommen, ob wir noch ein Produkt hinzufügen möchten oder nicht. Wenn ja, nochmal neue Daten
eingeben, wenn nein, soll das Hauptmenü angezeigt werden. Bei falscher Eingabe soll eine Info
„Fehlerhafte Eingabe“ erfolgen und das Hauptmenü wieder angezeigt werden.

3.)
Das Bearbeiten soll mit der Methode produktBearbeiten() durchgeführt werden.
Im Menüpunkt „Produkt bearbeiten“ sollen alle gespeicherten Produkte durchnummeriert angezeigt
werden. Ist kein Produkt vorhanden, soll die Info „Keine Produkte vorhanden“ angezeigt werden
und das Hauptmenü wieder aufgerufen werden. Nach der Auswahl des zu bearbeitenden Produkts
sollen die Eigenschaften neu eingegeben werden und das ausgewählte Produkt aktualisiert werden.
Sollte eine Eigenschaft fehlen/leer sein, darf das Produkt nicht abgespeichert werden und die Info
„Produkt konnte aufgrund leerer Eingabewerte nicht gespeichert werden“ soll angezeigt werden.
Anschließend soll das Hauptmenü wieder aufgerufen werden. Wurde das Produkt korrekt
aktualisiert und gespeichert, soll abgefragt werden, ob man nochmal ein Produkt bearbeiten möchte
oder nicht. Wenn ja, Bearbeiten erneut aufrufen und bei nein geht es zurück zum Hauptmenü.4.)
Das Suchen soll mit der Methode produktSuchen() durchgeführt werden. Es soll ein Suchbegriff
eingegeben werden und anschließend alle Treffer durchnummeriert ausgegeben werden. Bei der
Suche sollen alle Eigenschaften der Produkte überprüft werden. Anschließend soll abgefragt
werden, ob noch einmal gesucht werden soll oder das Hauptmenü angezeigt werden soll. Bei Ja,
Suche erneut durchführen, bei nein wird das Hauptmenü wieder angezeigt. Bei fehlerhafter Eingabe
soll eine Info „Fehlerhafte Eingabe“ erfolgen und das Hauptmenü wieder angezeigt werden.

5.)
Das Löschen soll mit der Methode produktLoeschen() durchgeführt werden.
Im Menüpunkt „Produkt löschen“ sollen alle gespeicherten Produkt durchnummeriert angezeigt
werden. Bei falscher Eingabe soll eine Info „Fehlerhafte Eingabe“ angezeigt werden und das
Hauptmenü wieder angezeigt werden. Nach richtiger Auswahl soll eine Abfrage angezeigt werden,
ob wirklich gelöscht werden soll. Wenn ja, lösche das Produkt, wenn nein, soll das Hauptmenü
wieder angezeigt werden.

6.)
Im Menüpunkt „Shop beenden“ soll nach einer Sicherheitsabfrage, ob wirklich beendet werden soll,
das Programm beendet werden. Wenn ja, soll „PC Shop wurde beendet“ angezeigt werden. Wenn
nicht, soll das Hauptmenü wieder angezeigt werden. Bei falscher Eingabe soll eine Info
„Fehlerhafte Eingabe“ angezeigt werden und das Hauptmenü wieder angezeigt werden. Für diesen
Menüpunkt soll die Methode „shopBeenden()“ benutzt werden.

Weitere Aufgaben:

1) Achten Sie darauf, dass alle fehlerhaften Eingaben abgefangen werden.
   
2) Dokumentieren Sie Ihren Code mit Java-Doc. Es müssen alle Methoden und Klassen
kommentiert werden. Zusätzlich können vereinzelt Variablen oder Codezeilen kommentiert
werden.

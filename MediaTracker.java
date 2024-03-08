import java.util.Scanner; // Import-Anweisung in Java. Sie wird verwendet, um externe Java-Bibliotheken oder Klassen im Programm verfügbar zu machen.

public class MediaTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bücherei auswählen
        System.out.println("Bitte wählen die Bücherei aus:");
        System.out.println("1 für Zentralbibliothek, 2 für Stadtteilbibliothek");
        int bibliothekTyp = scanner.nextInt();
        Bibliothek bibliothek;
        if (bibliothekTyp == 1) 
        {
            bibliothek = new Bibliothek(1,"Zentralbibliothek");
        } else if (bibliothekTyp == 2) {
            bibliothek = new Bibliothek(2,"Stadtteilbibliothek");
        } else {
            System.out.println("Ungültige Eingabe.");
            return;
        }
        
        // Leiher erfassen
        Leiher katharina = new Leiher(1707, "Katharina");
        Leiher marina = new Leiher(1802, "Marina");

        System.out.println("Gib deine Leiher ID ein:");
        int leiherID = scanner.nextInt();

        // Leiher anhand der ID finden
        Leiher aktuellerLeiher = null;
        if (leiherID == katharina.getLeiherID())
        {
            aktuellerLeiher = katharina;
        } else if (leiherID == marina.getLeiherID())
            
        {
            aktuellerLeiher = marina;
        } else {
            System.out.println("Leiher nicht gefunden.");
            return; // Programm beenden, da kein gültiger Leiher gefunden wurde
        }
        
        // Willkommensnachricht anzeigen
        System.out.println("Willkommen, " + aktuellerLeiher.getLeiherName() + "! Bitte gib nun die ID deines ausgeliehenen Mediums ein:");
        System.out.println("1 für Buch, 2 für CD, 3 für Spiel und 4 für Sonstiges");
        int mediumTyp = scanner.nextInt();

        switch (mediumTyp) {
            case 1:
                addBuch(aktuellerLeiher);
                break;
            case 2:
                addCD(aktuellerLeiher);
                break;
            case 3:
                addSpiel(aktuellerLeiher);
                break;
            case 4:
                addSonstiges(aktuellerLeiher);
                break;
            default:
                System.out.println("Ungültige Eingabe.");
        }

        // Hier kann der Code für ein Programm hinzugefügt werden
    }

    public static void addBuch(Leiher leiher) {
	// Hier kann der Code für ein Buch hinzugefügt werden
    }

    public static void addCD(Leiher leiher) {
	// Hier kann der Code für eine CD hinzugefügt werden
    }

    public static void addSpiel(Leiher leiher) {
	// Hier kann der Code für ein Spiel hinzugefügt werden
    }

    public static void addSonstiges(Leiher leiher) {
	// Hier kann der Code für Sonstiges hinzugefügt werden
    }
}
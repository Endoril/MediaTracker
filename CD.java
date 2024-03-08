public class CD extends Medium 
{
    private String Interpreten;
    private int Spieldauer; // In Minuten

    public CD (String titel, String bibliothek, String fälligAm, boolean istKinderMedium,
              String interpreten, int spieldauer) 
    {
        super(titel, bibliothek, fälligAm, istKinderMedium);
        Interpreten = interpreten;
        Spieldauer = spieldauer;
    }
}

public class Medium 
{
    private String Titel;
    private String Bibliothek;
    private String FälligAm;
    private boolean IstKinderMedium;

    public Medium(String titel, String bibliothek, String fälligAm, boolean istKinderMedium) 
    {
        Titel = titel;
        Bibliothek = bibliothek;
        FälligAm = fälligAm;
        setIstKinderMedium(istKinderMedium);
    }

    public boolean isIstKinderMedium() {
	return IstKinderMedium;
    }

    public void setIstKinderMedium(boolean istKinderMedium) {
	IstKinderMedium = istKinderMedium;
    }
}

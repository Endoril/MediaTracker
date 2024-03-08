class Buch extends Medium 
{
    private String Autor;
    
    public Buch(String titel, String zweigstelle, String datum,
                boolean kind, String autor) 
    {
        super (titel, zweigstelle, datum, kind); // Hier wurde die Superklasse korrigiert
        Autor = autor;
    }
    
    public String getAutor() 
    {
        return Autor;
    }
}
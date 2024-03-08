class Bibliothek
{
    private int BibID;
    private String BibName;
    
    public Bibliothek(int bibid, String bibname) 
    {
        BibID = bibid;
        BibName = bibname;
    }

    public int getBibID() 
    {
        return BibID;
    }

    public String getBibName() 
    {
        return BibName;
    }
}

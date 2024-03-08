class Leiher 
{
    private int LeiherID;
    private String LeiherName;
    
    public Leiher(int leiherid, String leihername) 
    {
        LeiherID = leiherid;
        LeiherName = leihername;
    }

    public int getLeiherID() 
    {
        return LeiherID;
    }

    public String getLeiherName() 
    {
        return LeiherName;
    }
}

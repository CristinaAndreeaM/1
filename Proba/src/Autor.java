public class Autor
{
    public String _nume;
    public int _varsta;
    public int  _anulDebut;

    public Autor (String nume , int varsta, int anDebut)
    {
        _nume=nume;
        _varsta=varsta;
        _anulDebut=anDebut;
    }
    public void setNume(String nume)
    {
        _nume=nume;
    }
    public void setVarsta(int varsta)
    {
        _varsta=varsta;
    }
    public void setAnDebut(int anDebut)
    {
        _anulDebut=anDebut;
    }
    public String getNume()
    {
        return _nume;
    }
    public int getVarsta()
    {
        return _varsta;
    }
    public int getAnDebut()
    {
        return _anulDebut;
    }

    public String toString()
    {
        return "Autor{" + "Nume='" + _nume + '\'' + ", Varsta=" + _varsta + ", An Debut=" + _anulDebut + '}';
    }
}

import java.util.TreeSet;

public class Departement implements IDepartement<Employe>
{
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement()
    {
    }

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }



    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departement that = (Departement) o;

        if (id != that.id) return false;
        return nomDepartement.equals(that.nomDepartement);
    }

    @Override
    public String toString()
    {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }

    @Override
    public void ajouterDepartement(Employe employe)
    {
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Employe employe)
    {
        return false;
    }

    @Override
    public void supprimerDepartement(Employe employe) {
    }

    @Override
    public void displayDepartement() {
    }

    @Override
    public TreeSet<Employe> trierDepartementById() {
        return null;
    }
}

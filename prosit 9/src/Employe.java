import java.util.Comparator;

public class Employe implements Comparable<Employe>
{

    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employe()
    {
        // Constructeur sans paramètre
    }

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    // Getters and setters

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

    @Override
    public String toString()
    {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe other)
    {
        return Integer.compare(this.id, other.id);
    }

    // Autres getters
    public String getNom()
    {
        return nom;
    }

    public String getNomDepartement()
    {
        return nomDepartement;
    }

    public int getGrade()
    {
        return grade;
    }
}

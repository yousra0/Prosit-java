public class Employe {
    private int identifiant;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employe()
    {
    }

    public Employe(int identifiant, String nom, String prenom, String nomDepartement, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employe employe = (Employe) o;

        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }

    @Override
    public String toString()
    {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }
}

import java.util.HashMap;

public class AffectationHashMap
{
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap()
    {
        affectations = new HashMap<>();
    }

    public void ajouterAffectation(Employe employe, Departement departement)
    {
        affectations.put(employe, departement);
    }

    public void ajouterEmployeDepartement(Employe employe, Departement departement)
    {
        if (!affectations.containsKey(employe))
        {
            affectations.put(employe, departement);
            System.out.println("Employee " + employe.getNom() + " assigned to department " + departement.getNomDepartement());
        } else {
            System.out.println("Employee " + employe.getNom() + " is already assigned to a department.");
        }
    }

    public void supprimerEmploye(Employe employe)
    {
        if (affectations.containsKey(employe))
        {
            affectations.remove(employe);
            System.out.println("Employee " + employe.getNom() + " removed from the collection.");
        } else {
            System.out.println("Employee " + employe.getNom() + " not found in the collection.");
        }
    }

    public void supprimerEmployeEtDepartement(Employe employe, Departement departement)
    {
        // Instruction 5: Remove the employee from the specified department
        if (affectations.containsKey(employe) && affectations.get(employe).equals(departement))
        {
            affectations.remove(employe);
            System.out.println("Employee " + employe.getNom() + " removed from department " + departement.getNomDepartement());
        } else {
            System.out.println("Employee " + employe.getNom() + " is not assigned to department " + departement.getNomDepartement());
        }
    }

    public void afficherEmployes()
    {
        System.out.println("List of Employees:");
        for (Employe employe : affectations.keySet())
        {
            System.out.println(employe.getNom());
        }
    }

    public void afficherDepartements()
    {
        System.out.println("List of Departements:");
        for (Departement departement : affectations.values())
        {
            System.out.println(departement.getNomDepartement());
        }
    }

    public void afficherEmployesEtDepartements()
    {
        System.out.println("Employees and their Departments:");
        for (HashMap.Entry<Employe, Departement> entry : affectations.entrySet()) {
            Employe emp = entry.getKey();
            Departement dep = entry.getValue();
            System.out.println("Employee: " + emp.getNom() + ", Department: " + dep.getNomDepartement());
        }
    }

    public boolean rechercherEmploye(Employe employe)
    {
        return affectations.containsKey(employe);
    }

    public boolean rechercherDepartement(Departement departement)
    {
        return affectations.containsValue(departement);
    }

    public TreeMap<Employe, Departement> trierMap()
    {
        return new TreeMap<>(affectations);
    }


}

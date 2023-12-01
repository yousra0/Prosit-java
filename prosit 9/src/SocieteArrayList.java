import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>
{

    private ArrayList<Employe> employesList = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe)
    {
        employesList.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {

        for (Employe employe : employesList)
        {
            if (employe.getNom().equals(nom))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe)
    {
        return employesList.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe)
    {
        employesList.remove(employe);
    }

    @Override
    public void displayEmploye()
    {
        for (Employe employe : employesList)
        {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId()
    {
        Collections.sort(employesList);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade()
    {
        Collections.sort(employesList, Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom));
    }
}

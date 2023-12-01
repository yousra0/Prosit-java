public class Main
{
    public static void main(String[] args)
    {
        AffectationHashMap affectationHashMap = new AffectationHashMap();


        Employe employe1 = new Employe(1, "John", "Doe", "HR", 3);
        Employe employe2 = new Employe(2, "Jane", "Doe", "IT", 2);
        Departement departement1 = new Departement(1, "HR", 5);
        Departement departement2 = new Departement(2, "IT", 10);

        affectationHashMap.ajouterEmployeDepartement(employe1, departement1);
        affectationHashMap.ajouterEmployeDepartement(employe2, departement2);
        affectationHashMap.afficherEmployesEtDepartements();
        affectationHashMap.ajouterEmployeDepartement(employe1, departement2);
        affectationHashMap.afficherEmployesEtDepartements();
        affectationHashMap.supprimerEmploye(employe1);
        affectationHashMap.afficherEmployesEtDepartements();

        System.out.println("Is employe1 in the collection? " + affectationHashMap.rechercherEmploye(employe1));
        System.out.println("Is departement2 in the collection? " + affectationHashMap.rechercherDepartement(departement2));

        System.out.println("Sorted Employees and Departments:");
        affectationHashMap.trierMap().forEach((emp, dep) -> System.out.println("Employee: " + emp.getNom() + ", Department: " + dep.getNomDepartement()));
    }
}

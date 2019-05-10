package bf.sonabel.facturation;
public class TestFacture {

  public static void main(String[] args) {
    // Cr?ation des articles
    Stylo s1 = new Stylo("s1", "Stylo jade", "Noir", "Watertruc", 500);
    Stylo s2 = new Stylo("s2", "Stylo or", "Or", "Marker", 1000);
    Ramette r1 = new Ramette("r1", "Ramette haute qualit?", 80, "Clairefont", 95);

    // Cr?ation des lots (10 % de r?duction)
    Lot l1 = new Lot("l1", s2, 5, 10);

    // Cr?ation d'une facture
    Facture f1 = new Facture("Toto", "21/9/99");

    // Ajout des lignes de la commande
    f1.ajouterLigne(s1,10);
    f1.ajouterLigne(r1,15);
    f1.ajouterLigne(l1,2);

    // Afficher la facture
    System.out.println(f1);

    // Cr?ation d'une autre facture
    Facture f2 = new Facture("Bibi", "21/9/99");

    // Ajout des lignes de la commande
    f2.ajouterLigne(s1,3);
    f2.ajouterLigne(r1,2);

    // Affiche la facture
    System.out.println();
    System.out.println(f2);

    // Test prix d'un lot
    s2.setPU(1200);
    System.out.println("\nAffiche la 1?re facture apr?s changement de prix");
    System.out.println(f1);
    
  }
}

package bf.sonabel.facturation;

/**
 * Stylo.
 */
public class Stylo extends ArticleUnitaire {
  private String couleur;

  public Stylo(String reference, String descriptif, String marque, 
               String couleur,double pu) {
    super(reference, descriptif, marque, pu);
    this.couleur = couleur;
  }

  public String getCouleur() {
    return couleur;
  }

  @Override
  public String toString() {
    return super.toString() + ";couleur=" + couleur;
  }
}
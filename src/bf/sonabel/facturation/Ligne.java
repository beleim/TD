package bf.sonabel.facturation;

class Ligne {
  private Article article;
  private int quantite;

  Ligne(Article article, int quantite) {
    this.article = article;
    this.quantite = quantite;
  }

  Article getArticle() {
    return article;
  }

  int getQuantite() {
    return quantite;
  }

  // Nécessite le JDK 5
  void afficheToi() {
    System.out.printf("%7d | %6s | %20.20s | %20.20s | %10.2f | %10.2f %n",
		      quantite, article.getReference(), 
		      article.getDescriptif(), 
		      article.getMarque(), article.getPU(), prixTotal());
  }

  double prixTotal() {
    return article.getPU() * quantite;
  }
    
  @Override
  public String toString() {
    return quantite + " " + article;
  }   
}
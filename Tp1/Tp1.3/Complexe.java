public class Complexe {
  public double partieReelle;
  public double partieImaginaire;

  /**
   * constructors
   */
  public Complexe() {}

  public Complexe(double partieReel, double partieImaginaire) {
    this.partieReelle = partieReel;
    this.partieImaginaire = partieImaginaire;
  }

  public Complexe(Complexe cmp) {
    this.partieReelle = cmp.partieReelle;
    this.partieImaginaire = cmp.partieImaginaire;
  }

  /**
   * accesseurs et mutateurs
   */

  public double getPartieReelle() {
    return partieReelle;
  }

  public void setPartieReelle(double partieReelle) {
    this.partieReelle = partieReelle;
  }

  public double getPartieImaginaire() {
    return partieImaginaire;
  }

  public void setPartieImaginaire(double partieImaginaire) {
    this.partieImaginaire = partieImaginaire;
  }

  public void ajouter(Complexe cmp) {
    this.partieReelle += cmp.partieReelle;
    this.partieImaginaire += cmp.partieImaginaire;
  }

  public void soustraire(Complexe cmp) {
    this.partieReelle -= cmp.partieReelle;
    this.partieImaginaire -= cmp.partieImaginaire;
  }

  public String toString() {
    return "z = " + this.partieReelle + " + " + this.partieImaginaire + "*i";
  }
}

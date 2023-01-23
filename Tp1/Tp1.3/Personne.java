class Personne {
  /* The class attributs */
  public String nom;
  public String prenom;
  public int age;
  public String sexe;

  /* The constructors */
  public Personne() {}

  public Personne(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
  }

  public Personne(String nom, String prenom, int age) {
    this(nom, prenom);
    this.age = age;
  }

  public Personne(String nom, String prenom, int age, String sexe) {
    this(nom, prenom, age);
    this.sexe = sexe;
  }

  public Personne(Personne personne) {
    this.nom = personne.nom;
    this.prenom = personne.prenom;
    this.age = personne.age;
    this.sexe = personne.sexe;
  }

  public String toString() {
    return (
      "Description : \nPrenom : " +
      this.prenom +
      " Nom : " +
      this.nom +
      " age : " +
      this.age +
      " sexe : " +
      this.sexe
    );
  }
}

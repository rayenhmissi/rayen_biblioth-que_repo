public class Livre extends Article {
    private String nom_editeur;
    public Livre(String titre,int nid,int nbp,String nom_auteur,String nom_editeur){
        super(titre, nid, nbp, nom_auteur);
        this.nom_editeur=nom_editeur;
    }
    public String getNom_editeur() {
        return nom_editeur;
    }
}

public class Article extends Document{
    protected String nom_auteur;
    public Article(String titre,int nid,int nbp,String nom_auteur){
        super(titre, nid, nbp);
        this.nom_auteur=nom_auteur;
    }
}

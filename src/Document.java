public class Document {
    protected String titre;
    protected int nid;
    protected int nbp;
    public Document(String titre,int nid,int nbp){
        this.titre=titre;
        this.nid=nid;
        this.nbp=nbp;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }    
    public int getNbp() {
        return nbp;
    }

    public void setNbp(int nbp) {
        this.nbp = nbp;
    }
    public Document(){
        this.nid=0;
        this.titre=null;
        this.nbp=0;
    }
    public void edition(){
        System.out.println("identifiant: "+this.getNid());
        System.out.println("titre: "+this.getTitre());
        System.out.println("nombre de page: "+this.getNbp());
    }
}

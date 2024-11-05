public class Biblio {
    private Document[] listdoc;
    private int nbd=0;
    private int cap;
    public int getCapacité() {
        return cap;
    }
    public Biblio(int c){
        this.cap=c;
        this.listdoc=new Document[this.cap];
    }
    public void ajout_doc(Document d){
        listdoc[nbd]=d;
        nbd++;
    }
    public void supprimer_doc(int num){
        for(int i=0;i < nbd;i++){
            if (listdoc[i].getNid()==num){
                listdoc[i]=listdoc[i+1];
                nbd--;    
            }
        }
    }
    public void inventaire(Document[] listdoc){
        for(int i=0;i< nbd;i++){
            this.listdoc[i].edition();
        }
    }
    public Biblio listerlivre(){
        Biblio bl=new Biblio(6);
        for(int i=0;i< nbd;i++){
            if (listdoc[i] instanceof Livre){
                bl.ajout_doc(listdoc[i]);
            }
        }
        System.out.println("document est ajouté");
        return bl;
    }
    public Biblio listerArticle(){
        Biblio ba=new Biblio(6);
        for(int i=0;i< nbd;i++){
            if (listdoc[i] instanceof Article){
                ba.ajout_doc(listdoc[i]);
            }
        }
        System.out.println("document est ajouté");
        return ba;
    }
    public Biblio listePeriodique(){
        Biblio bp=new Biblio(6);
        for(int i=0;i< nbd;i++){
            if (listdoc[i] instanceof Periodique){
                bp.ajout_doc(listdoc[i]);
            }
        }
        System.out.println("document est ajouté");
        return bp;
    }
}

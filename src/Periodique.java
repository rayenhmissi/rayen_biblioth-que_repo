public class Periodique extends Document{
    private int fp;
    public Periodique(String titre, int nid, int nbp, int fp) {
        super(titre, nid, nbp);
        this.fp = fp;
    }
    public int getFp() {
        return fp;
    }
}

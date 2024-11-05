public class Testbiblio {
    public static void main(String[] args) {
        Biblio b1=new Biblio(5);
        Livre d1=new Livre("java", 10, 100, "ahmed", "ahmed");
        Article d2=new Article("poo", 11, 150, "mohamed");
        b1.ajout_doc(d1);
        b1.ajout_doc(d2);
        System.out.println(b1.listerArticle());
    }
}

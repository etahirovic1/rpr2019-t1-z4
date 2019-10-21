package ba.unsa.etf.rpr;

class Artikl {

    private String naziv;
    private int cijena;
    private String kod;

    Artikl(String naziv, int cijena, String kod){
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    String getNaziv() {return naziv;}

    int getCijena() {return cijena;}

    String getKod(){ return kod;}
}

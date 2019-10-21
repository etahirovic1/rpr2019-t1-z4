package ba.unsa.etf.rpr;

public class Supermarket {

    Artikl sviArtikli[] =  new Artikl[1000];
    static int brojArtikala = 0;

    public void dodajArtikl(Artikl a) {
        if (brojArtikala < 1000) {
            sviArtikli[brojArtikala] = a;
            brojArtikala++;
        }
    }

    public Artikl[] getArtikli() {
        return sviArtikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
            Artikl izbaceni = null;
            for(int i=0; i<brojArtikala; i++){
                if(kod == sviArtikli[i].getKod()) {
                    izbaceni = sviArtikli[i];
                    for(int j=i+1; j<brojArtikala; j++) {
                        sviArtikli[i] = sviArtikli[j];
                        i = j;
                    }
                    sviArtikli[brojArtikala-1] = null;
                    brojArtikala--;
                }
            }
         return izbaceni;
    }

    public int getBrojArtikala() {return brojArtikala;}
}








package ba.unsa.etf.rpr;

class Supermarket {

    private Artikl[] sviArtikli =  new Artikl[1000];
    private static int brojArtikala = 0;

    void dodajArtikl(Artikl a) {
        if (brojArtikala < 1000) {
            sviArtikli[brojArtikala] = a;
            brojArtikala++;
        }
    }

    Artikl[] getArtikli() {
        return sviArtikli;
    }

    Artikl izbaciArtiklSaKodom(String kod){
            Artikl izbaceni = null;
            for(int i=0; i<brojArtikala; i++){
                if(kod.equals(sviArtikli[i].getKod())) {
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

    int getBrojArtikala() {return brojArtikala;}
}








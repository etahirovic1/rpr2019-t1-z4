package ba.unsa.etf.rpr;

class Korpa {

    private Artikl[] korpaArtikli = new Artikl[50];
    private int brojArtikalaKorpa = 0;

    boolean dodajArtikl(Artikl a) {
        if(brojArtikalaKorpa < 50 ) {
            brojArtikalaKorpa++;
            korpaArtikli[brojArtikalaKorpa-1] = a;
            return true;
        }
        return false;
    }

    int dajUkupnuCijenuArtikala(){
        int suma = 0;
        int i = 0;
        while(korpaArtikli[i] != null) {
            suma += korpaArtikli[i].getCijena();
            i++;
        }
        return suma;
    }

    Artikl[] getArtikli() {return korpaArtikli;}

    Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni = null;
        for(int i = 0; i < brojArtikalaKorpa; i++) {
            if(kod.equals(korpaArtikli[i].getKod())) {
                izbaceni = korpaArtikli[i];
                for(int j = i + 1; j < brojArtikalaKorpa; j++) {
                    korpaArtikli[i] = korpaArtikli[j];
                    i = j;
                }
                korpaArtikli[brojArtikalaKorpa - 1] = null;
                brojArtikalaKorpa--;
            }
        }
        return izbaceni;
    }
}






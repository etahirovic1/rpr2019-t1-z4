package ba.unsa.etf.rpr;

public class Korpa {

    Artikl korpaArtikli[] = new Artikl[50];
    int brojArtikalaKorpa = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikalaKorpa < 50 ) {
            brojArtikalaKorpa++;
            korpaArtikli[brojArtikalaKorpa-1] = a;
            return true;
        }
        return false;
    }

    public int dajUkupnuCijenuArtikala(){
        int suma = 0;
        int i = 0;
        while(korpaArtikli[i] != null) {
            suma += korpaArtikli[i].getCijena();
            i++;
        }
        return suma;
    }

    public Artikl[] getArtikli() {return korpaArtikli;}

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni = null;
        for(int i = 0; i < brojArtikalaKorpa; i++) {
            if(kod == korpaArtikli[i].getKod()) {
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






package pl.nikodem.samochod.symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private Sprzeglo sprzeglo;
    public SkrzyniaBiegow(String nazwa,  double waga, double cena, int iloscBiegow) {
        super(nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = new Sprzeglo("Basic", 200, 1000,true);
    }
    public void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow) {aktualnyBieg++;}
    }
    public void zmniejszBieg(){
        if (aktualnyBieg > 0) {aktualnyBieg--;}
    }
    public void luz(){
        aktualnyBieg = 0;
    }

    public int getAktualnyBieg() {return aktualnyBieg;}
    public int getIloscBiegow() {return iloscBiegow;}
    public Sprzeglo getSprzeglo() {return sprzeglo;}

    public void setIloscBiegow(int iloscBiegow) {
        this.iloscBiegow = iloscBiegow;
    }

}

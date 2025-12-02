package symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    public SkrzyniaBiegow(String nazwa,  double waga, double cena, int iloscBiegow) {
        super(nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
    }
    public static void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow) {aktualnyBieg++;}
    }
    public static void zmniejszBieg(){
        if (aktualnyBieg > 0) {aktualnyBieg--;}
    }
    public void luz(){
        aktualnyBieg = 0;
    }

}

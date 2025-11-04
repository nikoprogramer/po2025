package symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;
    public Silnik(String nazwa, double waga, double cena) {
        super(nazwa, waga, cena);
        this.maxObroty = 0;
        this.obroty = 0;
    }
    public void uruchom(){
        this.obroty = 800;
    }
    public void zatrzymaj() {
        this.obroty = 0;

    }
    public void zwiekszObroty() {
        this.obroty += 200;
    }
    public void zmniejszObroty() {
        this.obroty -= 200;
    }
    public int getMaxObroty() {
        return maxObroty;
    }
    public int getObroty() {
        return obroty;
    }
}

package symulator;

public class Samochod {
    Silnik silnik = new Silnik("V12", 1000d, 1000000d);
    SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("Automat", 1000d, 100000d, 6);
    public static void wlacz() {
        silnik.uruchom();
    }
    public static void wylacz() {
        silnik.zatrzymaj();
        skrzynia.luz();
    }

    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        samochod.wlacz();
        samochod.wylacz();
    }
}

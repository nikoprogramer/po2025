import java.util.*;

public class zad1 {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> mojeLotto = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = Integer.parseInt(args[i]);
            mojeLotto.add(liczba);
        }
        */

        Random rand = new Random();
        Random rand2 = new Random();

        ArrayList<Integer> liczbyLotto = new ArrayList<>();

        while (liczbyLotto.size() < 6) {
            int wynik = rand.nextInt(49) + 1;
            liczbyLotto.add(wynik);
        }

        int trafy = 0;
        int licznik = 0;
        //System.currentTimeMillis();
        while (trafy != 6) {
            ArrayList<Integer> losoweLotto = new ArrayList<>();
            for (int i = 0; i < 6; i++ ) {
                int wynik = rand2.nextInt(49) + 1;
                losoweLotto.add(wynik);
            }
            losoweLotto.retainAll(liczbyLotto);
            if (losoweLotto.size() != 6) {
                licznik++;
            }
            if  (losoweLotto.size() == 6) {
                System.out.println(licznik);
                System.out.println("Wygrywajace: " + liczbyLotto);
                trafy = 6;
            }

        }







        /*
        System.out.println("Wynik: " + liczbyLotto);
        System.out.println("Obstawilem: " + mojeLotto);
        boolean trafiles = false;
        for (int i = 0; i < liczbyLotto.size(); i++) {
            for (int j = 0; j < mojeLotto.size(); j++) {
                if (liczbyLotto.get(i).equals(mojeLotto.get(j))) {
                    System.out.println("Trafiles liczbe: " + mojeLotto.get(j));
                    trafiles = true;
                }
            }
        }
        if (!trafiles) {
            System.out.println("Nie trafiles zadnej liczby");
        }

        */
    }
}






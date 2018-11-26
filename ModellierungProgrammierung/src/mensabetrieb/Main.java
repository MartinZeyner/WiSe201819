package mensabetrieb;

import java.util.stream.IntStream;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
class Main {

  public static void main(String[] args) {
    final String[] angebot = new String[] {"Veganes Gericht", "Nudelteller", "Schneller Teller",
        "Grillteller", "Salat", "Fischgericht", "Wok"};

    final Mensa mensa = new Mensa(angebot, 200);

    IntStream.range(0, 540).forEach(i -> mensa.simuliere());
  }
}
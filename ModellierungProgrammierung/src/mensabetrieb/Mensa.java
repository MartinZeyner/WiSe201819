package mensabetrieb;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
class Mensa {
  private final Gast[] plaetze;
  private final String[] angebot;

  Mensa(String[] angebot, int platzZahl) {
    this.angebot = angebot;
    this.plaetze = new Gast[platzZahl];
  }

  void simuliere() {
    entferneGaeste();
    final int mengeGaeste = (int) (Math.random() * 16) + 5;
    if (IntStream.range(0, mengeGaeste).anyMatch(i -> !nimmGastAuf(erstelleGast()))) {
      System.out.println("FEHLER: Kein Platz mehr vorhanden!");
    }
    System.out.println("INFO: Neuer Gast");

    Arrays.stream(plaetze).filter(Objects::nonNull).forEach(Gast::simuliere);
  }

  private Gericht erstelleGericht() {
    final int gerichtNummer = (int) (Math.random() * angebot.length);
    final int menge = (int) (Math.random() * 100) + 100;
    return new Gericht(menge, angebot[gerichtNummer]);
  }

  private Gast erstelleGast() {
    final double geschwindigkeit = Math.random() * 5 + 5;
    return new Gast(geschwindigkeit, erstelleGericht());
  }

  private boolean nimmGastAuf(Gast gast) {
    for (int i = 0; i < plaetze.length; i++) {
      if (plaetze[i] == null) {
        plaetze[i] = gast;
        return true;
      }
    }
    return false;
  }

  private void entferneGaeste() {
    for (int i = 0; i < plaetze.length; i++) {
      if (plaetze[i] != null && plaetze[i].istFertig()) {
        plaetze[i] = null;
      }
    }
  }
}

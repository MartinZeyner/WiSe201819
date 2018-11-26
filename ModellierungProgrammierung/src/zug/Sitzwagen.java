package zug;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 15:39
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Sitzwagen extends Wagen {
  private char klasse;

  public Sitzwagen(char klasse, short sitzplaetze) {
    super(sitzplaetze);
    this.klasse = klasse;
  }

  public char getKlasse() {
    return klasse;
  }

  public void setKlasse(char klasse) {
    this.klasse = klasse;
  }
}

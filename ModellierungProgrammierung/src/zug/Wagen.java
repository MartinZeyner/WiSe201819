package zug;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 15:42
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Wagen {
  private short anzahlSitzplaetze;

  public Wagen(short anzahlSitzplaetze) {
    this.anzahlSitzplaetze = anzahlSitzplaetze;
  }

  public short getAnzahlSitzplaetze() {
    return anzahlSitzplaetze;
  }

  public void setAnzahlSitzplaetze(short anzahlSitzplaetze) {
    this.anzahlSitzplaetze = anzahlSitzplaetze;
  }
}

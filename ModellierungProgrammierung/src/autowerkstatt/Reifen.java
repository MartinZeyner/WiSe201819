package autowerkstatt;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 16:14
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Reifen extends Bauteil {
  private char typ;

  public Reifen(char typ, String modellBezeichnung, boolean defekt) {
    super(modellBezeichnung, defekt);
    this.typ = typ;
  }

  public char getTyp() {
    return typ;
  }

  public void setTyp(char typ) {
    this.typ = typ;
  }
}

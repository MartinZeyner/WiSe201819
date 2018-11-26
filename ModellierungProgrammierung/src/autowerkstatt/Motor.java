package autowerkstatt;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 16:14
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Motor extends Bauteil {
  private byte anzahlZylinder;
  private float oelstandAnteil;

  public Motor(byte anzahlZylinder, float oelstandAnteil, String bezeichnung, boolean defekt) {
    super(bezeichnung, defekt);
    this.anzahlZylinder = anzahlZylinder;
    this.oelstandAnteil = oelstandAnteil;
  }

  public byte getAnzahlZylinder() {
    return anzahlZylinder;
  }

  public void setAnzahlZylinder(byte anzahlZylinder) {
    this.anzahlZylinder = anzahlZylinder;
  }

  public float getOelstandAnteil() {
    return oelstandAnteil;
  }

  public void setOelstandAnteil(float oelstandAnteil) {
    this.oelstandAnteil = oelstandAnteil;
  }
}

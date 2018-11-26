package autowerkstatt;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 16:12
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Auto {
  private Bauteil[] bauteil;

  public Auto(Bauteil[] bauteil) {
    this.bauteil = bauteil;
  }

  public Bauteil[] getBauteil() {
    return bauteil;
  }

  public void setBauteil(Bauteil[] bauteil) {
    this.bauteil = bauteil;
  }
}

package autowerkstatt;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 16:13
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Bauteil {
  private String modellBezeichnung;
  private boolean defekt;

  public Bauteil(String modellBezeichnung, boolean defekt) {
    this.modellBezeichnung = modellBezeichnung;
    this.defekt = defekt;
  }

  public String getModellBezeichnung() {
    return modellBezeichnung;
  }

  public void setModellBezeichnung(String modellBezeichnung) {
    this.modellBezeichnung = modellBezeichnung;
  }

  public boolean isDefekt() {
    return defekt;
  }

  public void setDefekt(boolean defekt) {
    this.defekt = defekt;
  }
}

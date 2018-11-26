package zug;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 15:37
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Zug {
  private Speisewagen[] speisewagen;
  private Sitzwagen[] sitzwagen;
  private String zugnummer;

  public Zug(Speisewagen[] speisewagen, Sitzwagen[] sitzwagen, String zugnummer) {
    this.speisewagen = speisewagen;
    this.sitzwagen = sitzwagen;
    this.zugnummer = zugnummer;
  }

  public Speisewagen[] getSpeisewagen() {
    return speisewagen;
  }

  public void setSpeisewagen(Speisewagen[] speisewagen) {
    this.speisewagen = speisewagen;
  }

  public Sitzwagen[] getSitzwagen() {
    return sitzwagen;
  }

  public void setSitzwagen(Sitzwagen[] sitzwagen) {
    this.sitzwagen = sitzwagen;
  }

  public String getZugnummer() {
    return zugnummer;
  }

  public void setZugnummer(String zugnummer) {
    this.zugnummer = zugnummer;
  }
}
